class seoulStay{
   static void seoulStay(){
      int summen = 0;
      double menAvg = 0;
      int sumwomen = 0;
      double womenAvg = 0;
      int[] addressSum = new int[25];
      double[] addressAvg = new double[25];

      String[] city = {"Jongno9", "Joong9", "Yongsan9", "Sungdong9", "Gwangjin9",
                       "Dongdaemun9", "Joongrang9", "Sungbuk9", "Kangbuk9", "Doobong9",
                       "Nowon9", "Eunpyeong9", "Seodaemun9", "Mapo9", "Yangcheon9", "Kangseo9",
                       "Guro9", "Keumcheon9", "Youngdeungpo9", "Dongjack9", "Kwanak9","Seocho9",
                       "Kangnam9", "Songpa9", "Kangdong9"};
      int[][] data={
          {74425, 76326},
          {61164, 61636},
          {109688, 115744},
          {144796, 146776},
          {174996, 181676},
          {177841, 177434},
          {204630, 205980},
          {223373, 232245},
          {161055, 166130},
          {171576, 176735},
          {279169, 293772},
          {239450, 251066},
          {148690, 156510},
          {182977, 196992},
          {237792, 242641},
          {283869, 296762},
          {209344, 210282},
          {118965, 114441},
          {186503, 186856},
          {195734, 203014},
          {254381, 249472},
          {212401, 229111},
          {271654, 295354},
          {319197, 335045},
          {229829, 231671}
      };
      for(int i=0; i<data.length; i++){
          summen += data[i][0];
          sumwomen += data[i][1];
          for(int j=0; j<data[i].length; j++){
             addressSum[i] += data[i][j];
          }
          addressAvg[i] = (double)addressSum[i]/(data[i].length);
          System.out.println(city[i]+"(Sum: "+addressSum[i] + ", Avg: "+addressAvg[i]+")");
          }
          menAvg = (double)summen/(data.length); 
          womenAvg = (double)sumwomen/(data.length); 
          System.out.println("mennumber : "+summen+", menAvg : "+menAvg); 
          System.out.println("womennumber : "+sumwomen+", womenAvg : "+womenAvg+"\n");
          
          System.out.println("graph");
          for(int i=0; i<data.length; i++){ 
	     System.out.print("("); 
             for(int j =0;j<data[i].length;j++){ 
                System.out.printf(" %d ",data[i][j]); 
             } 
             System.out.print(")\n"); 
          } 
   }

   public static void main(String[] args){
      seoulStay();
   }
} 