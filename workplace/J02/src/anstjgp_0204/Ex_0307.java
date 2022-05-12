package anstjgp_0204;

public class Ex_0307 {

	public static void main(String[] args) {
		
		/* Networking
		 *   : 분산되어 있는 두 개 이상의 컴퓨터를 통신만으로 연결하여 네트워크 구성
		 * 클라이언트(Client)/서버(Server)
		 *  > 클라이언트 : 서비스를 요청하는 프로그램
		 *  > 서버 : 구 요청에 응답하는 프로그램
		 * IP주소 (= 네트워크주소 + 호스트주소
		 *   : IP는 컴퓨터와 네트워크에서 장치들이 서로를 인식하고 통신을 하기 위해
		 *     컴퓨터마다 부여되는 고유한 주소
		 * URL(Uniform Resource Location)
		 *   : 인터넷에 존재하는 여러 서버들이 제공하는 지원에 접근할 수 있는 주소를 표현하기 위한 것    
		 *     (= 프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링#참조)
		 *    > 프로토콜 : 자원에 접근하기 위해 서버와 통신하는데 사용되는 통신 규약(https)
		 *    > 호스트명 : 자원을 제공하는 서버의 이름(search.daum.net)
		 *    > 경로명 : 접근하려는 자원이 저장된 서버상의 위치( /sample)
		 *    > 파일명 : 접근하려는 자원의 이름(hello.jsp)
		 *    > 쿼리 : URL에서 ? 이후의 부분
		 *    > 참조 : URL에서 # 이후의 부분 
		 *    
		 * URL Connection
		 *   : 어플리케이션과 URL간의 통신연결을 나타내는 클래스의 최상위 클래스
		 *
		 * 소켓 프로그래밍 TCP와 UDP
		 *   : 소켓을 이용하여 통신을 하는 방식에는 TCP와 UDP가 있다
		 *   > 연결방식 TCP : 연결후 통신,  1:1통신 방식
		 *			 UDP : 연결하지 않고 통신, 1:1부터 n:n통신
		 *   > 특징 TCP : 데이터의 전송 순서 보장
		 *               데이터의 수신여부 확인
		 *               UDT보다 느림
		 *         UDP : 데이터의 전송 순서 보장되지 않음
		 *               순서가 바뀔 수 있음
		 *               데이터의 수신여부 확인 안함
		 *               TCP보다 속도가 빠름
		 *   > 관련클래스 TCP : Socket, ServerSoket
		 *             UDP : DatagramSocket, DatagramPacket, MulticastSocket             
		 * Socket
		 *   : 프로세서간의 통신을 담당하며, Inputstream, OutputStream
		 * ServerSocket
		 *   : 포트와 연결되어 외부의 연결요청을 기다리다 연결 요청이 들어오면 Socket을 생성해서
		 *     소켓과 소켓간의 통신이 이루어지도록 한다
		 *     한 포트에는 하나의 ServerSocket만 연결할 수 있다
		 * TcpIPServer.java
		 * TcpIPClient.java
		 *           
		 */  
	}

}





























