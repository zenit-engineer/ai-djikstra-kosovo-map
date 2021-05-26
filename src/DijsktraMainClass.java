import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class DijsktraMainClass {

   public static List<Node> shortestPath = new ArrayList<Node>();
   public static double shortestDistance;
   public static long execution;
   public static double elapsedTimeInSecond;

   //Nodes-Qytetet
   static boolean n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22,n23,n24,n25,n26,n27,n28,n29,n30,n31,n32,n33,n34,n35,n36,n37,n38,n39,n40;
   
   //Edges - lidhjet e mundshme te qyteteve mes vete
   static boolean e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e48, e49, e50, e52, e53, e54, e55, e56, e57, e58, e59, e60, e61, e62, e63,e64,e65,e66,e67,e68,e69,e70,e71,e72,e73,e74,e75,e76,e77,e78,e79,e80,e81,e82,e83,e84,e85,e86,e87,e88,e89;
 
 
   String qyteti1="";
   String qyteti2="";
   
   public static int Qyteti1;
   public static int Qyteti2;
  
  /* InputLocations paneliInput = new InputLocations();

   ActionListener ac = new ActionListener() {
         public void actionPerformed(ActionEvent actionEvent) {
         // TODO Auto-generated method stub
            qyteti1=paneliInput.getLabel1();
            qyteti2=paneliInput.getLabel2();
            paneliInput.dispose();
         
         }
      };


   public DijsktraMainClass(){
            paneliInput.submit.addActionListener(ac);
   };*/
 
 
 
	public static void main(String[] args) {
   
       DijsktraMainClass obj= new DijsktraMainClass();
   
       /*  while(obj.qyteti1.equals("")) {
               System.out.println("running");
                  
                  
           }*/
   
    
		//Create vertices
      ArrayList<Node> nodes= new ArrayList<>();
		Node Podujeve = new Node("Podujeve");  nodes.add(Podujeve);   
      Node Prishtine = new Node("Prishtine");  nodes.add(Prishtine);
		Node Mitrovice = new Node("Mitrovice"); nodes.add(Mitrovice);
		Node Leposaviq = new Node("Leposaviq"); nodes.add(Leposaviq);
		Node Zveqan = new Node("Zveqan");nodes.add(Zveqan);
		Node ZubinPotok = new Node("Zubin Potok");nodes.add(ZubinPotok);
      Node Vushtrri = new Node("Vushtrri");nodes.add(Vushtrri);
      Node Skenderaj = new Node("Skenderaj");nodes.add(Skenderaj);
      Node Istog = new Node("Istog");nodes.add(Istog);
      Node Obiliq = new Node("Obiliq");nodes.add(Obiliq);
      Node Drenas = new Node("Drenas");nodes.add(Drenas);
      Node Kamenice = new Node("Kamenice");nodes.add(Kamenice);
      Node Novoberde = new Node("Novoberde");nodes.add(Novoberde);
      Node FusheKosove = new Node("FusheKosove");nodes.add(FusheKosove);
      Node Lipjan = new Node("Lipjan");nodes.add(Lipjan);
      Node Malisheve = new Node("Malisheve");nodes.add(Malisheve);
      Node Kline = new Node("Kline");nodes.add(Kline);
      Node Peje = new Node("Peje");nodes.add(Peje);
      Node Decan = new Node("Decan");nodes.add(Decan);
      Node Gjakove = new Node("Gjakove");nodes.add(Gjakove);
      Node Rahovec = new Node("Rahovec");nodes.add(Rahovec);
      Node Prizren = new Node("Prizren");nodes.add(Prizren);
      Node Shterpce = new Node("Shterpce");nodes.add(Shterpce);
      Node Ferizaj = new Node("Ferizaj");nodes.add(Ferizaj);
      Node Kacanik = new Node("Kacanik");nodes.add(Kacanik);
      Node Viti = new Node("Viti");nodes.add(Viti);
      Node Shtime = new Node("Shtime");nodes.add(Shtime);
      Node Gjilan = new Node("Gjilan");nodes.add(Gjilan);
      Node Suhareke = new Node("Suhareke");nodes.add(Suhareke);
      Node Dragash = new Node("Dragash");nodes.add(Dragash);
      Node Lluzhan=new Node("Lluzhan");nodes.add(Lluzhan);
      Node Komoran= new Node("Komoran");nodes.add(Komoran);
      Node Junik=new Node("Junik");nodes.add(Junik);
      Node Rastavice=new Node("Rastavice");nodes.add(Rastavice);
      Node Sllatine=new Node("Sllatine");nodes.add(Sllatine);
      Node Duhel=new Node("Duhel");nodes.add(Duhel);
      Node Kerpimeh=new Node("Kerpimeh");nodes.add(Kerpimeh);
      Node Plave=new Node("Plave");nodes.add(Plave);
      Node Xerxe=new Node("Xerxe");nodes.add(Xerxe);
      Node Prevalle=new Node("Prevalle");nodes.add(Prevalle);
      

      for(int i=0; i<nodes.size(); i++){
      
         if(nodes.get(i).data.equals(obj.qyteti1)){    
            obj.Qyteti1=i;
         }
         
         if(nodes.get(i).data.equals(obj.qyteti2)){
         
         obj.Qyteti2=i;
         
         }
      }


	
		//Fqinjet e Podujeves 		
      Podujeve.addNeighbor(new Edge(76, Podujeve, Leposaviq));
		Podujeve.addNeighbor(new Edge(30, Podujeve, Obiliq));
		Podujeve.addNeighbor(new Edge(40, Podujeve, Vushtrri));
      Podujeve.addNeighbor(new Edge(12, Podujeve, Lluzhan));
      Podujeve.addNeighbor(new Edge(12, Podujeve, Kerpimeh));
		
      //Fqinjet e Prishtines
		Prishtine.addNeighbor(new Edge(59, Prishtine, Kamenice));
		Prishtine.addNeighbor(new Edge(41, Prishtine, Novoberde));
		Prishtine.addNeighbor(new Edge(10, Prishtine, Obiliq));
      Prishtine.addNeighbor(new Edge(18, Prishtine, Lipjan));
      Prishtine.addNeighbor(new Edge(20, Prishtine, Lluzhan));
      Prishtine.addNeighbor(new Edge(8, Prishtine, FusheKosove));
		
      //Fqinjet e Mitrovices
		Mitrovice.addNeighbor(new Edge(5,  Mitrovice, Zveqan  ));
      Mitrovice.addNeighbor(new Edge(47,  Mitrovice, Leposaviq));
      Mitrovice.addNeighbor(new Edge(19,  Mitrovice, ZubinPotok));
      Mitrovice.addNeighbor(new Edge(39,  Mitrovice, Kerpimeh));
      Mitrovice.addNeighbor(new Edge(12,  Mitrovice, Vushtrri));
      Mitrovice.addNeighbor(new Edge(22,  Mitrovice, Skenderaj));
      
      
      //Fqinjet e Leposaviqit
      Leposaviq.addNeighbor(new Edge(76,  Leposaviq, Podujeve));
      Leposaviq.addNeighbor(new Edge(22,  Leposaviq, Zveqan));
      Leposaviq.addNeighbor(new Edge(47,  Leposaviq, Mitrovice));

      //Fqinjte e Zveqanit 
      Zveqan.addNeighbor(new Edge(22,  Zveqan, Leposaviq));
      Zveqan.addNeighbor(new Edge(5,   Zveqan, Mitrovice));
      Zveqan.addNeighbor(new Edge(22,  Zveqan, ZubinPotok));
      
      //Fqinjte e Zubin Potokut 
      ZubinPotok.addNeighbor(new Edge(22,  ZubinPotok, Zveqan));
      ZubinPotok.addNeighbor(new Edge(33,  ZubinPotok, Skenderaj));
      ZubinPotok.addNeighbor(new Edge(44,  ZubinPotok, Istog));

     //Fqinjte e Vushtrrise
      Vushtrri.addNeighbor(new Edge(12,  Vushtrri, Mitrovice));
      Vushtrri.addNeighbor(new Edge(40,  Vushtrri, Podujeve));
      Vushtrri.addNeighbor(new Edge(21,  Vushtrri, Obiliq));
      Vushtrri.addNeighbor(new Edge(36,  Vushtrri, Drenas));
		
		//Fqinjte e Skenderajt
      Skenderaj.addNeighbor(new Edge(22,  Skenderaj, Mitrovice));
      Skenderaj.addNeighbor(new Edge(33,  Skenderaj, ZubinPotok));
      Skenderaj.addNeighbor(new Edge(18,  Skenderaj, Drenas));
      Skenderaj.addNeighbor(new Edge(26,  Skenderaj, Kline));
      Skenderaj.addNeighbor(new Edge(32,  Skenderaj, Istog));
      
      //Fqinjte e Istogut
      Istog.addNeighbor(new Edge(44,  Istog, ZubinPotok));
      Istog.addNeighbor(new Edge(32,  Istog, Skenderaj));
      Istog.addNeighbor(new Edge(24,  Istog, Peje));
      Istog.addNeighbor(new Edge(14,  Istog, Kline));
      
      //Fqinjte e Obiliqit
      Obiliq.addNeighbor(new Edge(30,  Obiliq, Podujeve));
      Obiliq.addNeighbor(new Edge(21,  Obiliq, Vushtrri));
      Obiliq.addNeighbor(new Edge(10,  Obiliq, Prishtine));
      Obiliq.addNeighbor(new Edge(25,  Obiliq, Drenas));
      Obiliq.addNeighbor(new Edge(17,  Obiliq, Sllatine));
      
      //Fqinjte e Drenasit
      Drenas.addNeighbor(new Edge(40,  Drenas, Kline));
      Drenas.addNeighbor(new Edge(36,  Drenas, Vushtrri));
      Drenas.addNeighbor(new Edge(25,  Drenas, Obiliq));
      Drenas.addNeighbor(new Edge(24,  Drenas, Malisheve));
      Drenas.addNeighbor(new Edge(18,  Drenas, Skenderaj));
      Drenas.addNeighbor(new Edge(20,  Drenas, Sllatine));
      
      //Fqinjte e Kamenices
      Kamenice.addNeighbor(new Edge(59,  Kamenice, Prishtine));
      Kamenice.addNeighbor(new Edge(22,  Kamenice, Novoberde));
      Kamenice.addNeighbor(new Edge(27,  Kamenice, Gjilan));
      
      //Fqinjte e Novoberdes
      Novoberde.addNeighbor(new Edge(41,  Novoberde, Prishtine));
      Novoberde.addNeighbor(new Edge(22,  Novoberde, Kamenice));
      Novoberde.addNeighbor(new Edge(43,  Novoberde, Lipjan));
      Novoberde.addNeighbor(new Edge(22,  Novoberde, Gjilan));
      
      //Fqinjte e FusheKosove
      FusheKosove.addNeighbor(new Edge(7,  FusheKosove, Prishtine));
      FusheKosove.addNeighbor(new Edge(14,  FusheKosove, Sllatine));
      
      //Fqinjte e Lipjanit
      Lipjan.addNeighbor(new Edge(18,  Lipjan, Prishtine));
      Lipjan.addNeighbor(new Edge(43,  Lipjan, Novoberde));
      Lipjan.addNeighbor(new Edge(12,  Lipjan, Shtime));
      Lipjan.addNeighbor(new Edge(20,  Lipjan, Ferizaj));
      Lipjan.addNeighbor(new Edge(39,  Lipjan, Gjilan));
      Lipjan.addNeighbor(new Edge(22,  Lipjan, Sllatine));
      
      //Fqinjte e Malisheves
      Malisheve.addNeighbor(new Edge(24,  Malisheve, Drenas));
      Malisheve.addNeighbor(new Edge(28,  Malisheve, Kline));
      Malisheve.addNeighbor(new Edge(24,  Malisheve, Suhareke));
      
      //Fqinjte e Klines
      Kline.addNeighbor(new Edge(18,  Kline, Decan));
      Kline.addNeighbor(new Edge(43,  Kline, Drenas));
      Kline.addNeighbor(new Edge(12,  Kline, Skenderaj));
      Kline.addNeighbor(new Edge(20,  Kline, Istog));
      Kline.addNeighbor(new Edge(39,  Kline, Peje));
      Kline.addNeighbor(new Edge(22,  Kline, Gjakove));
      Kline.addNeighbor(new Edge(22,  Kline, Malisheve));
      
      //Fqinjte e Pejes
      Peje.addNeighbor(new Edge(24,  Peje, Istog));
      Peje.addNeighbor(new Edge(14,  Peje, Decan));
      Peje.addNeighbor(new Edge(29,  Peje, Kline));
      
      //Fqinjte e Decanit
      Decan.addNeighbor(new Edge(41,  Decan, Kline));
      Decan.addNeighbor(new Edge(22,  Decan, Gjakove));
      Decan.addNeighbor(new Edge(14,  Decan, Peje));
      Decan.addNeighbor(new Edge(10,  Decan, Junik));
      Decan.addNeighbor(new Edge(7,  Decan, Rastavice));
      
      //Fqinjte e Gjakoves
      Gjakove.addNeighbor(new Edge(22,  Gjakove, Decan));
      Gjakove.addNeighbor(new Edge(35,  Gjakove, Kline));
      Gjakove.addNeighbor(new Edge(14,  Gjakove, Xerxe));
      
      //Fqinjte e Rahovecit
      Rahovec.addNeighbor(new Edge(17,  Rahovec, Suhareke));
      Rahovec.addNeighbor(new Edge(46,  Rahovec, Prizren));
      Rahovec.addNeighbor(new Edge(10,  Rahovec, Xerxe));
    
      //Fqinjte e Prizrenit
      Prizren.addNeighbor(new Edge(23,  Prizren, Xerxe));
      Prizren.addNeighbor(new Edge(31,  Prizren, Suhareke));
      Prizren.addNeighbor(new Edge(46,  Prizren, Rahovec));
      Prizren.addNeighbor(new Edge(29,  Prizren, Plave));
      Prizren.addNeighbor(new Edge(30,  Prizren, Prevalle));
      
      //Fqinjte e Shterpce
      Shterpce.addNeighbor(new Edge(63,  Shterpce, Suhareke));
     Shterpce.addNeighbor(new Edge(24,  Shterpce, Ferizaj));
Shterpce.addNeighbor(new Edge(22,  Shterpce, Kacanik));
      Shterpce.addNeighbor(new Edge(16,  Shterpce, Prevalle));
      
      //Fqinjte e Ferizajt
      
     // Ferizaj.addNeighbor(new Edge(24,  Ferizaj, Shterpce));
      Ferizaj.addNeighbor(new Edge(22,  Ferizaj, Kacanik));
      Ferizaj.addNeighbor(new Edge(13,  Ferizaj, Shtime));
      Ferizaj.addNeighbor(new Edge(20,  Ferizaj, Lipjan));
      Ferizaj.addNeighbor(new Edge(21,  Ferizaj, Viti));
      Ferizaj.addNeighbor(new Edge(33,  Ferizaj, Gjilan));
      
      //Fqinjte e Kacanikut
      Kacanik.addNeighbor(new Edge(25,  Kacanik, Shterpce));
      Kacanik.addNeighbor(new Edge(22,  Kacanik, Ferizaj));
      Kacanik.addNeighbor(new Edge(22,  Kacanik, Viti));
      
      //Fqinjte e Vitise
      Viti.addNeighbor(new Edge(22,  Viti, Kacanik));
      Viti.addNeighbor(new Edge(21,  Viti, Ferizaj));
      Viti.addNeighbor(new Edge(20,  Viti, Gjilan));
      
      //Fqinjte e Shtimes
      Shtime.addNeighbor(new Edge(12,  Shtime, Lipjan));
      Shtime.addNeighbor(new Edge(13,  Shtime, Ferizaj));
      Shtime.addNeighbor(new Edge(20,  Shtime, Duhel));
      
      //Fqinjte e Gjilanit
      Gjilan.addNeighbor(new Edge(27,  Gjilan, Kamenice));
      Gjilan.addNeighbor(new Edge(22,  Gjilan, Novoberde));
      Gjilan.addNeighbor(new Edge(33,  Gjilan, Ferizaj));
      Gjilan.addNeighbor(new Edge(20,  Gjilan, Viti));
      Gjilan.addNeighbor(new Edge(39,  Gjilan, Lipjan));
     
     //Fqinjte e Suharekes
      Suhareke.addNeighbor(new Edge(24,  Suhareke, Malisheve));
      Suhareke.addNeighbor(new Edge(17,  Suhareke, Rahovec));
      Suhareke.addNeighbor(new Edge(31,  Suhareke, Prizren));
      Suhareke.addNeighbor(new Edge(63,  Suhareke, Shterpce));
      Suhareke.addNeighbor(new Edge(10,  Suhareke, Duhel));
     
     //Fqinjte e Dragashit
      Dragash.addNeighbor(new Edge(6,  Dragash, Plave));
      
     //Fqinjte e Lluzhanit
      Lluzhan.addNeighbor(new Edge(12,  Lluzhan, Podujeve));
      Lluzhan.addNeighbor(new Edge(20,  Lluzhan, Prishtine));
      
      //Fqinjte e Komoranit
      Komoran.addNeighbor(new Edge(25,  Komoran, Shtime));
      Komoran.addNeighbor(new Edge(9,  Komoran, Drenas));
      
      //Fqinjte e Junikut
      Junik.addNeighbor(new Edge(24,  Junik, Decan));
      Junik.addNeighbor(new Edge(17,  Junik, Gjakove));
      Junik.addNeighbor(new Edge(31,  Junik, Rastavice));
      
       //Fqinjte e Rastavices
      Rastavice.addNeighbor(new Edge(7,  Rastavice, Decan));
      Rastavice.addNeighbor(new Edge(16,  Rastavice, Gjakove));
      Rastavice.addNeighbor(new Edge(6,  Rastavice, Junik));
      
       //Fqinjte e Sllatine
      Sllatine.addNeighbor(new Edge(14,  Sllatine, FusheKosove));
      Sllatine.addNeighbor(new Edge(20, Sllatine, Drenas));
      Sllatine.addNeighbor(new Edge(22,  Sllatine, Lipjan));
      Sllatine.addNeighbor(new Edge(17,  Sllatine, Obiliq));

      //Fqinjte e Duhles
      Duhel.addNeighbor(new Edge(10,  Duhel, Suhareke));
      Duhel.addNeighbor(new Edge(20,  Duhel, Shtime));
      
      //Fqinjte e Kerpimehit
      Kerpimeh.addNeighbor(new Edge(11,  Kerpimeh, Podujeve));
      Kerpimeh.addNeighbor(new Edge(39,  Kerpimeh, Mitrovice));

      //Fqinjte e Plaves
      Plave.addNeighbor(new Edge(29,  Plave, Prizren));
      Plave.addNeighbor(new Edge(6,  Plave, Dragash));
      
      //Fqinjte e Xerxe
      Xerxe.addNeighbor(new Edge(14,  Xerxe, Gjakove));
      Xerxe.addNeighbor(new Edge(10,  Xerxe, Rahovec));
      Xerxe.addNeighbor(new Edge(23,  Xerxe, Prizren));
      
      //Fqinjte e Prevalles
      Prevalle.addNeighbor(new Edge(30,  Prevalle, Prizren));
      Prevalle.addNeighbor(new Edge(16,  Prevalle, Shterpce));

		
      
          Node source = Viti       ;
         Node target = Peje;
		
	// Node source = nodes.get(obj.Qyteti1);
	 // Node target = nodes.get(obj.Qyteti2);
		
      long start = System.nanoTime();
      
       computePath(source);   
       shortestPath = getShortestPathTo(target);   
       shortestDistance = target.getDistance();
       
        long end = System.nanoTime();
        execution = end - start;
        System.out.println(execution + " nanoseconds");
   
   
                           
        elapsedTimeInSecond = (double) execution / 1_000_000_000;                   
        System.out.println(elapsedTimeInSecond + " seconds");     

   
      
      
      
            
      if(shortestPath.contains(Podujeve)) {n1=true;} if(shortestPath.contains(Lluzhan)) {n31=true;} if(shortestPath.contains(Prishtine)) n2 =true;
      if(shortestPath.contains(Mitrovice)) n3 =true; if(shortestPath.contains(Leposaviq)) n4 =true; if(shortestPath.contains(Zveqan)) n5 =true;
      if(shortestPath.contains(ZubinPotok)) n6 =true; if(shortestPath.contains(Vushtrri)) n7 =true; if(shortestPath.contains(Skenderaj)) n8 =true;
      if(shortestPath.contains(Istog)) n9 =true;       if(shortestPath.contains(Obiliq)) n10 =true;
      if(shortestPath.contains(Drenas)) n11 =true;   if(shortestPath.contains(Kamenice)) n12 =true; if(shortestPath.contains(Novoberde)) n13 =true;
      if(shortestPath.contains(FusheKosove)) n14 =true; if(shortestPath.contains(Lipjan)) n15 =true; if(shortestPath.contains(Malisheve)) n16 =true;
      if(shortestPath.contains(Kline)) n17 =true; if(shortestPath.contains(Peje)) n18 =true; if(shortestPath.contains(Decan)) n19 =true;
      if(shortestPath.contains(Gjakove)) n20 =true;  if(shortestPath.contains(Rahovec)) n21 =true; if(shortestPath.contains(Prizren)) n22 =true;
      if(shortestPath.contains(Shterpce)) n23 =true; if(shortestPath.contains(Ferizaj)) n24 =true; if(shortestPath.contains(Kacanik)) n25 =true;
      if(shortestPath.contains(Viti)) n26 =true; if(shortestPath.contains(Shtime)) n27 =true; if(shortestPath.contains(Gjilan)) n28 =true;
      if(shortestPath.contains(Suhareke)) n29 =true; if(shortestPath.contains(Dragash)) n30 =true; //        if(shortestPath.contains(Lluzhan)) n31=true;
      if(shortestPath.contains(Komoran)) n32=true; if(shortestPath.contains(Junik)) n33=true; if(shortestPath.contains(Rastavice)) n34=true;
      if(shortestPath.contains(Sllatine)) n35=true;  if(shortestPath.contains(Duhel)) n36=true; if(shortestPath.contains(Kerpimeh)) n37=true;
      if(shortestPath.contains(Plave)) n38=true;  if(shortestPath.contains(Xerxe)) n39=true; if(shortestPath.contains(Prevalle)) n40=true;   
      if(shortestPath.contains(Leposaviq)&&shortestPath.contains(Podujeve)) {e1=true; } if(shortestPath.contains(Leposaviq)&&shortestPath.contains(Zveqan)) {e2=true;}
      if(shortestPath.contains(Zveqan)&&shortestPath.contains(Mitrovice)) {e4=true; } if(shortestPath.contains(Zveqan)&&shortestPath.contains(ZubinPotok)) {e5=true;}
      if(shortestPath.contains(Mitrovice)&&shortestPath.contains(ZubinPotok)){ e6=true;} if(shortestPath.contains(Mitrovice)&&shortestPath.contains(Vushtrri)) {e7=true;}
      if(shortestPath.contains(Mitrovice)&&shortestPath.contains(Podujeve)) {e8=true;} if(shortestPath.contains(Mitrovice)&&shortestPath.contains(Skenderaj)){ e9=true;}
      if(shortestPath.contains(ZubinPotok)&&shortestPath.contains(Skenderaj)){ e10=true;} if(shortestPath.contains(ZubinPotok)&&shortestPath.contains(Istog)) {e11=true;}
      if(shortestPath.contains(Podujeve)&&shortestPath.contains(Obiliq)) {e13=true;} if(shortestPath.contains(Podujeve)&&shortestPath.contains(Vushtrri)) {e14=true;}
      if(shortestPath.contains(Vushtrri)&&shortestPath.contains(Obiliq)) {e15 =true;} if(shortestPath.contains(Vushtrri)&&shortestPath.contains(Drenas)) {e16=true;}
      if(shortestPath.contains(Prishtine)&&shortestPath.contains(Kamenice)){ e17=true;} if(shortestPath.contains(Prishtine)&&shortestPath.contains(Novoberde)){ e18=true;}
      if(shortestPath.contains(Prishtine)&&shortestPath.contains(FusheKosove)){ e19=true;}  if(shortestPath.contains(Prishtine)&&shortestPath.contains(Obiliq)) {e20=true;}
      if(shortestPath.contains(Prishtine)&&shortestPath.contains(Lipjan)) {e21=true;} if(shortestPath.contains(Kamenice)&&shortestPath.contains(Novoberde)){ e22=true;}
      if(shortestPath.contains(Kamenice)&&shortestPath.contains(Gjilan)) {e23=true;} if(shortestPath.contains(Novoberde)&&shortestPath.contains(Lipjan)) {e24=true;}
      if(shortestPath.contains(Novoberde)&&shortestPath.contains(Gjilan)) {e25=true;} if(shortestPath.contains(Obiliq)&&shortestPath.contains(FusheKosove)){ e26=true;}
      if(shortestPath.contains(Obiliq)&&shortestPath.contains(Drenas)) {e27=true;} if(shortestPath.contains(FusheKosove)&&shortestPath.contains(Lipjan)) {e28=false;}
      if(shortestPath.contains(FusheKosove)&&shortestPath.contains(Drenas)) {e29=true;} //  if(shortestPath.contains(Drenas)&&shortestPath.contains(Lipjan)) {e30=true;}
      if(shortestPath.contains(Drenas)&&shortestPath.contains(Malisheve)){ e31=true;}  if(shortestPath.contains(Drenas)&&shortestPath.contains(Skenderaj)) {e32=true;}
      if(shortestPath.contains(Skenderaj)&&shortestPath.contains(Kline)){ e33=true;} if(shortestPath.contains(Skenderaj)&&shortestPath.contains(Istog)) {e34=true;}
      if(shortestPath.contains(Istog)&&shortestPath.contains(Peje)) {e35=true;} if(shortestPath.contains(Istog)&&shortestPath.contains(Kline)){ e36=true;}
      if(shortestPath.contains(Peje)&&shortestPath.contains(Decan)) {e37=true;} if(shortestPath.contains(Decan)&&shortestPath.contains(Gjakove)){ e38=true;}
      if(shortestPath.contains(Peje)&&shortestPath.contains(Kline)) {e39=true;} if(shortestPath.contains(Kline)&&shortestPath.contains(Gjakove)) {e40=true;}
      if(shortestPath.contains(Kline)&&shortestPath.contains(Malisheve)) {e41=true;} if(shortestPath.contains(Malisheve)&&shortestPath.contains(Suhareke)){ e44=true;}
      if(shortestPath.contains(Suhareke)&&shortestPath.contains(Rahovec)) {e45=true; } if(shortestPath.contains(Suhareke)&&shortestPath.contains(Prizren)) {e46=true;}
      //if(shortestPath.contains(Suhareke)&&shortestPath.contains(Ferizaj)) {e48=true;}
      if(shortestPath.contains(Suhareke)&&shortestPath.contains(Shterpce)) {e49=true;} if(shortestPath.contains(Shterpce)&&shortestPath.contains(Ferizaj)) {e53=true;}
      if(shortestPath.contains(Shterpce)&&shortestPath.contains(Kacanik)) {e54=true;}
      if(shortestPath.contains(Kacanik)&&shortestPath.contains(Ferizaj)) {e55=true;}
      if(shortestPath.contains(Kacanik)&&shortestPath.contains(Viti)) {e56=true;}
      if(shortestPath.contains(Shtime)&&shortestPath.contains(Lipjan)) {e57=true;}
      if(shortestPath.contains(Shtime)&&shortestPath.contains(Ferizaj)) {e58=true;}
      if(shortestPath.contains(Ferizaj)&&shortestPath.contains(Lipjan)) {e59=true;}
      if(shortestPath.contains(Ferizaj)&&shortestPath.contains(Viti)) {e60=true;}
      if(shortestPath.contains(Ferizaj)&&shortestPath.contains(Gjilan)) {e61=true;}
      if(shortestPath.contains(Gjilan)&&shortestPath.contains(Viti)) {e62=true;}
      if(shortestPath.contains(Gjilan)&&shortestPath.contains(Lipjan)) {e63=true;}
      if(shortestPath.contains(Podujeve)&& shortestPath.contains(Lluzhan)){e64=true;  }
      if (shortestPath.contains(Lluzhan)&& shortestPath.contains(Prishtine)){e65=true; }
      if (shortestPath.contains(Podujeve)&&shortestPath.contains(Kerpimeh)){ e66=true;}
      if (shortestPath.contains(Kerpimeh)&&shortestPath.contains(Mitrovice)){e67 =true;}
      if (shortestPath.contains(Obiliq)&&shortestPath.contains(Sllatine)){e68 =true; }
      if (shortestPath.contains(Drenas)&&shortestPath.contains(Sllatine)){e69 =true; }
      if (shortestPath.contains(FusheKosove)&&shortestPath.contains(Sllatine)){e70 =true; }
      if (shortestPath.contains(Lipjan)&&shortestPath.contains(Sllatine)){e71 =true; }
      if (shortestPath.contains(Gjakove)&&shortestPath.contains(Xerxe)){e72 =true;}
      if (shortestPath.contains(Rahovec)&&shortestPath.contains(Xerxe)){e73 =true; }
      if (shortestPath.contains(Prizren)&&shortestPath.contains(Plave)){e74 =true; }
      if (shortestPath.contains(Dragash)&&shortestPath.contains(Plave)){e75 =true;}
      if (shortestPath.contains(Prizren)&&shortestPath.contains(Prevalle)){e76 =true; }
      if (shortestPath.contains(Shterpce)&&shortestPath.contains(Prevalle)){e77 =true; }
      if (shortestPath.contains(Shtime)&&shortestPath.contains(Komoran)){e78 =true; }
      if (shortestPath.contains(Drenas)&&shortestPath.contains(Komoran)){e79 =true; }
      if (shortestPath.contains(Decan)&&shortestPath.contains(Junik)){e80 =true; }
      if (shortestPath.contains(Gjakove)&&shortestPath.contains(Junik)){e81 =true; }
      if (shortestPath.contains(Rastavice)&&shortestPath.contains(Junik)){e82 =true; }
      if (shortestPath.contains(Decan)&&shortestPath.contains(Rastavice)){e83 =true; }
      if (shortestPath.contains(Gjakove)&&shortestPath.contains(Rastavice)){e84 =true; }
      if (shortestPath.contains(Shtime)&&shortestPath.contains(Duhel)){e85 =true; }
      if(shortestPath.contains(Suhareke)&&shortestPath.contains(Duhel)){e86=true; }
      if(shortestPath.contains(Drenas)&&shortestPath.contains(Kline)){e87=true; }
      if(shortestPath.contains(Kline)&&shortestPath.contains(Decan)){e88=true; }
      if(shortestPath.contains(Xerxe)&&shortestPath.contains(Prizren)){e89=true; }


		new Map();
		//Print the shortest shortestPath and shortest distance
		System.out.println("Rruga qe duhet ndjekur eshte: " + shortestPath );
      System.out.println("Distanca: " + shortestDistance + " km");
    
    //  System.out.println(nodes.get(1).data.equals("Prishtine"));
      
	
	}
   
   /**--- Algoritmet per implementimin e Dijktras*/  
   public static void computePath(Node sourceNode) {
		
		sourceNode.setDistance(0); //Setting distance to itself as zero
		
		PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(sourceNode);
		
		while(!priorityQueue.isEmpty()) {
			
			Node actualNode = priorityQueue.poll();
			
			for (Edge edge : actualNode.getAdjacencyEdgeList()) {
				
				Node v = edge.getEndNode();
				double newDistance = actualNode.getDistance() + edge.getWeight();
				if (newDistance < v.getDistance()) {
					priorityQueue.remove(v);
					v.setDistance(newDistance);
					v.setPredecessor(actualNode);
					priorityQueue.add(v);
				}
			}}
	}
   
   
	
	public static List<Node> getShortestPathTo(Node targetNode) {
		List<Node> shortestPathToNode = new ArrayList<Node>();
		
		for(Node node = targetNode; node !=null; node = node.getPredecessor()) {
			shortestPathToNode.add(node);
		}
      	
		Collections.reverse(shortestPathToNode);
		
		return shortestPathToNode;
	}

   
   
   
   
   

}
