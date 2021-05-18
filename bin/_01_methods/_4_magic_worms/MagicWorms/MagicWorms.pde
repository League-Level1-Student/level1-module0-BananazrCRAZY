/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

/** This program draws a magical pattern **/
int e = 1;
int w = 1;
// The setup method is run once when the program starts
void setup() {

  //Set your canvas size
  size(600, 600);
  //Set a background color  
  background(#000000);
}

// The draw method runs continuously (in a loop) until the program ends
void draw() {

  // STEP 1.
  // Use a for loop to draw 300 small ellipses in a diagonal line across the canvas.
  // Make them a bright color.
  // RUN THE PROGRAM TO CHECK IT (see the recipe for the expected outcome).
  /*
  for (int i = 0; i <= 600; i+=2) {
    fill(255, 0, 0);
    ellipse(i, i, 10, 10);
  }
  */
  // STEP 2.
  // Now make each ellipse use random values for their x and y co-ordinates. Make sure they are inside the canvas. 
  // Hint:  random(int maxValue)
  // RUN THE PROGRAM TO CHECK IT (see the recipe for the expected outcome).
  /*
  for (int i = 0; i <= 600; i+=2) {
    int x = (int) random(width);
    int y = (int) random(width);
    fill(255, 0, 0);
    ellipse(x, y, 10, 10);
  }
  */
  // STEP 3.
  // Now use the getWormX() and getWormY() methods for x and y co-ordinates of each ellipse
  //(use the for loop variable as the parameter to these methods).
  // RUN THE PROGRAM TO CHECK IT (see the recipe for the expected outcome).
  /*
  for (int i = 0; i <= 600; i+=2) {
    double x = getWormX(i);
    double y = getWormY(i);
    fill(255, 0, 0);
    ellipse((int) x, (int) y, 10, 10);
  }
  */
  // STEP 4.
  // Call makeMagical() in your draw method before the for loop. 
  // OPTIONS: Pass in frameCount or another variable for the ellipse "red value", 
  // and i as the "green value" for some extra color coolness.
  makeMagical();
  for (int i = 0; i <= 600; i+=2) {
    e += 1;
    double r = random(255);
    double x = getWormX(i);
    double y = getWormY(i);
    fill(e, i, (int) r);
    ellipse((int) x, (int) y, 10, 10);
  }
}

/// DO NOT CHANGE THE CODE BELOW. CALL THE METHODS FROM THE DRAW METHOD
   float frequency = .001;
   float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
