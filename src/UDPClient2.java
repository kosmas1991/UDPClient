import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient2 {

	public static void main(String[] args) {
		DatagramSocket socket;
		try {
			socket = new DatagramSocket();
			byte[] receiveData = new byte[1024];
			byte[] sendData = new byte[1024];
			while (true) {
			String clientSendData = "Hello serva from CLIENT 2";
			sendData = clientSendData.getBytes();
			InetAddress serverAddress = InetAddress.getByName("localhost");
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 8080);
			socket.send(sendPacket); 
			}
		/*	DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			socket.receive(receivePacket);
			String receivedString  = new String(receivePacket.getData());
			System.out.println("RECEIVED: " + receivedString);
			socket.close(); */
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

}
