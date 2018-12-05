import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Cliente {// cliente da aplicação 
     
	public void main (String[] args) throws RemoteException, MalformedURLException, NotBoundException {

		ServidorImpl s= (ServidorImpl) Naming.lookup("Servidor");

		s.conectar(this); // chamada remota
         String mensagem="aaa";

		s.enviar(mensagem);

		s.desconectar(this);

		}
	public void exibir(String mensagem) {
		// TODO Auto-generated method stub
		
	}

}
