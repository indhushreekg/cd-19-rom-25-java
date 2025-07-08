 class Speaker{
 static boolean isConnected;
  static int currentVolume;
  static int maxVolume=7;
 //onorof//increasevolume//decreasevolume
 
 public static void onOrOff(){
 if(isConnected==false){
 isConnected=true;
 System.out.println("the speaker is turned on");
 
 }else if(isConnected==true)
 {
 isConnected=false;
 System.out.println("the speaker is turned off");
 }
 
 }
 //increaseVolume
 public static void increaseVolume(){
	 System.out.println("increaseVolume started");
	 if(isConnected==true){
		 if(currentVolume<=maxVolume){
			 currentVolume=currentVolume+1;
			 System.out.println("the currentVolume is"+currentVolume);
		 }else{
			 System.out.println("max volume reached");
			 
		 }
		 }else{
			 System.out.println("turn on the speaker");
			 
		 }
	 }
	 //decrease volume
	 public static void decreaseVolume(){
		 System.out.println("decreaseVolume started");
		 if(isConnected==false){
			 if(currentVolume>=maxVolume){
				 currentVolume=currentVolume-1;
				 System.out.println("the currentVolume is"+currentVolume);
			 }else{
				 System.out.println("min volume reached");
			 }
			 
		 }else{
			 System.out.println("turn off the speaker");
		 }
	 }
 
 }
 
 
 
 
 
 