int x1 = 200;
int x2 = 800;
void setup(){
 size(1000, 400);
}
void draw(){
background(#E7E3EA);
    int f = 50;
 int e =45;
  for(int i = 40; i > 1; i--){
    
    
 
 if (i % 2 ==0){

  
  noFill();
  ellipse(x1,200,i*10 , i*10);
 }
 
 else{
  noFill();
  ellipse(x1, 200 , i*10,i*10 );
 }

  
 

  
  }


  for(int i = 40; i > 1; i--){
    
    
 
 if (i % 2 ==0){

  
  noFill();
  ellipse(x2,200,i*10 , i*10);
 }
 
 else{
  noFill();
  ellipse(x2, 200 , i*10,i*10 );
 }

  
 

  
  }
if(x1 < 800){
 x1++; 
 
}
if(x2 > 200){
  x2--;
  
}
else{
  x1 = 200;
  x2 = 800;
}
}
