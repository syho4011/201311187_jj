﻿import ch.aplu.turtle.*;

Turtle t1 = new Turtle()

void makeSwirlSquare(int size, int bigger, int turns, double degree){
   for(int i=0; i<turns; i++){
      if(i%2 !=0){
         size+=bigger;
      }
      t1.forward(size);
      t1.right(degree);
   }
}



makeSwirlSquare(10,15,20,90.0)
