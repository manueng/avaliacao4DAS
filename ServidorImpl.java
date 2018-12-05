import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


      
	public  class ServidorImpl extends UnicastRemoteObject implements ServidorChat {
		protected ServidorImpl() throws RemoteException {  // servidor do modelo Rmi , stub ja que envia mensagens , so fica faltando a parte de  deserialização da mensagem e skeleton ja que ele tambem exibi a mensagem para o cliente . 
			super();
			// TODO Auto-generated constructor stub
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		ArrayList<Cliente> Conectados= new ArrayList<Cliente>() ;    
		@Override
		public String conectar(Cliente c) throws RemoteException {
			Conectados.add(c);

			return("Usuario Conectado");
		}

		@Override
		public void desconectar(Cliente c) throws RemoteException {
			// TODO Auto-generated method stub
			
		}
		public void enviar (String mensagem) throws RemoteException {

			int i=0;
			do {

			Cliente c =(Cliente) Conectados.get(i);

			c.exibir(mensagem);

			} while (i<Conectados.size());

			}
		public static   void main  (String[] args) {

			try {
			ServidorImpl s= new ServidorImpl();

			Naming.rebind("Servidor",s);

			} catch (Exception e) {

			System.out.println ("Erro no servidor: " + e.getMessage()); }
	}
	}
