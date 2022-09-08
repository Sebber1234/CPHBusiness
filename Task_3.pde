color red = color(255, 0, 0);
color yellow = color(255, 255, 0);
color green = color(0, 255, 0);
color bckgrnd = color(0);

boolean on = true;

void setup()
{
  size(200, 600);
  background(bckgrnd);
  noStroke();
  frameRate(100);
  ellipseMode(CENTER);

  // Red off
  fill(75);
  ellipse(100, 100, 150, 150);

  // Yellow off
  fill(75);
  ellipse(100, 300, 150, 150);

  // Green off
  fill(75);
  ellipse(100, 500, 150, 150);
}

void draw()
{
  if (frameCount >= 0 && frameCount <= 100)
  {
    fill(red);
    ellipse(100, 100, 150, 150);
  } else if (frameCount >= 100 && frameCount <= 150)
  {
    fill(yellow);
    ellipse(100, 300, 150, 150);
  } else if (frameCount > 170)
  {
    // Red off
    fill(75);
    ellipse(100, 100, 150, 150);

    // Yellow off
    fill(75);
    ellipse(100, 300, 150, 150);

    // Green ON
    fill(green);
    ellipse(100, 500, 150, 150);
  }
}
