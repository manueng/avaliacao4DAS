

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

	 

	public class HelloImpl extends UnicastRemoteObject implements Hello {

	        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
			private static String nome;

	        public HelloImpl(String s) throws java.rmi.RemoteException {

	               super();
	               nome = s;

	        }

	        public String sayHello() throws RemoteException {

	               return "Hello World !!!";

	        }

			public static void main(String[] args) {


	               try {  
	                       HelloImpl obj = new HelloImpl("HelloServer");

	                       Naming.rebind("HelloServer", obj);

	                       System.out.println("HelloImpl foi criado e registrado");
	               }

	               catch(Exception e) {

	                       System.out.println("Ocorreu uma exceção no servidor");

	                       e.printStackTrace();

	               }

	        }

	}


