void setup(){
  size(100, 100);
}

void draw(){
  int e = #456899;;
  for(int i = 0; i<1000; i++){
 
  e= i + e;
  fill(00000);
  ellipse(50,50,20,20);
  
 fill(e);
  ellipse(50,50,18,18);
  
  fill(00000);
  ellipse(50,50,12,12);
  
  fill(e);
  ellipse(50,50, 10, 10);
  
  fill(00000);
  ellipse(50,50,4, 4);
  }
}
