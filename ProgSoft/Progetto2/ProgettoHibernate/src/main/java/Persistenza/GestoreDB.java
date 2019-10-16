package Persistenza;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;

import Contabilita.Pagamento;
import Contabilita.Ricevuta;
import Negozio.Prodotto;
import Persistenza.GestoreDB;
import id.databasemaster.hibernate.ProgettoHibernate.Employee;
import id.databasemaster.hibernate.ProgettoHibernate.HibernateUtil;

public class GestoreDB {
	
	
	private static GestoreDB dao;
	private Connection connection;
	private Statement statement;
	
	/*
	 * Nel costruttore dobbiamo collegarci al database.
	 * Singleton
	 */
	private GestoreDB() {
		//da completare
	}
	
	public static GestoreDB getInstance() {
		if(dao==null) {
			return dao= new GestoreDB();
		}
		return null;
	}
	 
	
	/*
	 * METODI PER LA GESTIONE DEI PRODOTTI
	 * 
	 * Metodo che ritorna lista prodotti del database
	 */
	public List<Prodotto> getAllProdotti() {

		try{
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			 @SuppressWarnings("unchecked")
			 List<Prodotto> prodotti = (List<Prodotto>) session.createQuery("FROM Prodotto p ORDER BY p.nome").list();
			 System.out.println("PRODOTTI CARICARI DAL DATABASE");
			 
			 
			session.getTransaction().commit();
			session.close();
			return prodotti;
		}
		catch(Exception exception){
			System.out.println("Eccezione "+exception.getMessage());
			System.out.println("Nel metodo getAllProdotti GestoreDB");
			System.out.println(exception.getStackTrace());
			return null;
		}
			
	}
	
	
	/* NON SERVE VIENE FATTO NEL MAGAZZINO
	public Prodotto getProdotto(String id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		 @SuppressWarnings("unchecked")
		 Prodotto p= session.createQuery();	
	}
	*/
	
	/*
	 * METODO PER L'AGGIORNAMENTO DEI PRODOTTI NEL DATABASE
	 */
	public void updateProdotti(List<Prodotto> prodotti) {
		try{
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction trans=session.beginTransaction();
			
			for(Prodotto p: prodotti) {
				System.out.println("OK");
				//CARICHIAMO IL PRODOTTO CORRISPONDENTE DAL DATABASE
				Prodotto pDB= (Prodotto) session.get(Prodotto.class,p.getId());
				
				//AGGIORNIAMO OGNI CAMPO DEL PRODOTTO NEL CASO C'è STATO UN CAMBIAMENTO
				if(pDB.getGiacenza()!= p.getGiacenza()) {
					System.out.println("OK-if");
					//SOLO LA GIACENZA PUò ESSERE MODIFICATA
					pDB.setGiacenza(p.getGiacenza());
				}
				
				System.out.println("PRODOTTI AGGIORNATI NEL DATABASE");
				 
			}
			trans.commit();
			session.close();
		}
		catch(Exception exception){
			System.out.println("Eccezione "+exception.getMessage());
			System.out.println("Nel metodo updateProdotti GestoreDB");
			System.out.println(exception.getStackTrace());
		}
		
	}
	
	
	/*
	 * Metodo per il popolamento della tabella dei prodotti
	 */
	public void saveProdotto(Prodotto p) {

		try{
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			session.save(p);
			
			session.getTransaction().commit();
			session.close();
			
			System.out.println("PRODOTTO SALVATO");
		}
		catch(Exception exception){
			System.out.println("Eccezione "+exception.getMessage());
			System.out.println("Nel metodo saveProdotto GestoreDB");
			System.out.println(exception.getStackTrace());
		}

	}
	
	
	/*
	 * METODI PERSISTENZA RICEVUTA
	 */
	//Prendiamo tutte le ricevute
	public List<Ricevuta> getAllRicevute() {

		try{
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			 @SuppressWarnings("unchecked")
			 List<Ricevuta> prodotti = (List<Ricevuta>) session.createQuery("FROM Ricevuta").list();
			 System.out.println("PRODOTTI CARICARI DAL DATABASE");
			 
			 
			session.getTransaction().commit();
			session.close();
			return prodotti;	
		}
		catch(Exception exception){
			System.out.println("Eccezione "+exception.getMessage());
			System.out.println("Nel metodo getAllRicevute GestoreDB");
			System.out.println(exception.getStackTrace());
			return null;
		}
		
	}
	
	//Ricevuta dal pagamentoId
	public List<Ricevuta> getAllRicevuteByPagamentoId(String pagamentoId) {

		try{
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			 @SuppressWarnings("unchecked")
			 List<Ricevuta> prodotti = (List<Ricevuta>) session.createQuery("FROM Ricevuta r WHERE r.pagamentoID="+pagamentoId).list();
			 System.out.println("PRODOTTI CARICARI DAL DATABASE");
			 
			 
			session.getTransaction().commit();
			session.close();
			return prodotti;	
		}
		catch(Exception exception){
			System.out.println("Eccezione "+exception.getMessage());
			System.out.println("Nel metodo getAllRicevuteByPagamentoId GestoreDB");
			System.out.println(exception.getStackTrace());
			return null;
		}
	
	}





	/*
	 *	GESTIONE PERSISTENZA PAGAMENTO
	 */
	public List<Pagamento> getPagamentiById(String Pagamentoid){

		try{
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();

			@SuppressWarnings("unchecked")
			List<Pagamento> pagamenti = (List<Pagamento>) session.createQuery("FROM PAGAMENTO p WHERE p.id="+Pagamentoid).list();
			System.out.println("PRODOTTI CARICARI DAL DATABASE");
			
			session.getTransaction().commit();
			session.close();

			return pagamenti;

		}
		catch(Exception exception){
			System.out.println("Eccezione "+exception.getMessage());
			System.out.println("Nel metodo getPagamentoById GestoreDB");
			System.out.println(exception.getStackTrace());
			return null;
		}


	}

	public List<Pagamento> getPagamentiByRicevutaId(String ricevutaId){
		try{
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();

			@SuppressWarnings("unchecked")
			List<Pagamento> pagamenti = (List<Pagamento>) session.createQuery("FROM PAGAMENTO p WHERE p.ricevutaId="+ricevutaId).list();
			System.out.println("PRODOTTI CARICARI DAL DATABASE");
			
			session.getTransaction().commit();
			session.close();

			return pagamenti;

		}
		catch(Exception exception){
			System.out.println("Eccezione "+exception.getMessage());
			System.out.println("Nel metodo getPagamentoByRicevutaId GestoreDB");
			System.out.println(exception.getStackTrace());
			return null;
		}
	}





/*
try{

		}
		catch(Exception exception){
			System.out.println("Eccezione "+exception.getMessage());
			System.out.println("Nel metodo updateProdotti GestoreDB");
			System.out.println(exception.getStackTrace());
		}
*/


	

}
