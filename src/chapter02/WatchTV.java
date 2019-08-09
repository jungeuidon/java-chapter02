package chapter02;

public class WatchTV {

	public static void main(String[] args) {
		
		TV tv = new TV(7, 20, false); //채널 , 볼륨 , ON/OFF 여부
		
        tv.status();	
        
        tv.power( true );
        tv.volume( 120 );   // volume = 120
        tv.status();		          
        
        tv.volume( false );  // volume--
        tv.status();
        
        tv.channel( 0 );
        tv.status();		          
        
        tv.channel( true ); // 1증가
        tv.channel( true );
        tv.channel( true );
        tv.status();

        tv.power( false );
        tv.status();      		          
    }
}

	