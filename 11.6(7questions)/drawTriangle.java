class drawTriangle{
   static void Triangle(int t){
      String s="*";
      StringBuffer sbuf=new StringBuffer();
      String w=" ";
      StringBuffer wbuf=new StringBuffer();
      for(int i=0; i<t; i++){
         for(int j=0; j<t-i; j++){
            sbuf.append(w);
         }
      
         System.out.printf("%s",wbuf.toString());
         wbuf.delete(0, sbuf.length());
         for(int k=0; k<i*2+1; k++){
            sbuf.append(s);
         }
         System.out.printf("%s",sbuf.toString());
         sbuf.delete(0, sbuf.length());
         System.out.printf("\n");
         
      }
   }
   public static void main(String args[]){
      
      Triangle(10);
   }
}