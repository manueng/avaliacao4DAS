import java.rmi.*;
public class Clienterecebedor {
	public interface Cliente extends Remote {

		public void Exibir(String mensagem) throws RemoteException;

		}
}
