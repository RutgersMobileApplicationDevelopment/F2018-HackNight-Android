<h1>Tip Calculator</h1>

<h3>Step 0: Creating your Project</h3> 
  Refer to the 'Hello World' Tutorial for instructions on setting up your project & emulator. Name your project 'Tip Calculator'

<h3>Step 1: Setting up the Layout</h3> 
  Now that you have created your project, we can begin to create our app. We will start by creating the components that are going to be necessary for the app. To do this, open your 'activity_main.xml' file
<img src="https://snag.gy/TfYkua.jpg" width="400"></img>
  In your 'activity_main.xml' file, we will be adding the components that will be necessary to this app. We will need (2) EditText (Decimal), (1) Button, and (3) TextView. Take a few minutes to toggle the colors, sizes, IDs, etc.
<img src="https://snag.gy/xd3OR5.jpg" width="400"><img>
  <b>Note:</b> If it isn't apparent from the way the layout is set up, users will type in a 'Total Amount' and a 'Tip Percentage', and upon a click of the button, the bottom TextView 'Tip Amount' should update to show the Tip.

<h3>Step 2: Objectives</h3>
  Now that we have set up our layout, we can start coding. Our objective:
<ol>
  <li>Register all the components in the MainActivity so that we can use them</li>
  <li>When a user clicks the button, a method should fire in the MainActivity</li>
  <li>This method should retrieve the data in "Total Amount" & "Tip Percentage" and calculate the Tip</li>
  <li>Once the Tip has been calculated, we should edit the TextView "Tip Amount" to show the Tip</li>
</ol>
<br></br>
  <b>Note:</b> From this point, it would be advisable to close the tutorial and attempt to create the app by yourself.
<br></br>

<h3>Step 3: Registering the Components</h3>
To register a component, you will need to know the ID of the component. Then, use the method "findViewById" to... Find your View By ID. An example is shown below, where I initialize three different types of components.
<img src="https://snag.gy/CrXnFe.jpg" width="400"></img>
<b>Note:</b> When prompted, press "Alt-Enter" to auto-import the components. 

<h3>Step 4: Programming the Button</h3>
<ul>
  <li>This is the moment we've been waiting for. Some actual coding. As you see in the screenshot below, we will be calling the method ".setOnClickListener(new OnClickListener{...}" on our button. As you might have guessed, this method gets called whenever the button is clicked.</li>
</ul>
<img src="https://snag.gy/Yfkb87.jpg" width="400"></img>
  <b>Note:</b> If this class structure looks unfamiliar, it's because we are using an 'Anonymous Class'. You can read up on this concept for more information.
<br></br>  
<b>Inside the "OnClick" method:</b>
<ul>
  <li>When our button is clicked, we want it to retrieve the data in our EditText's ("Total Amount" & "Tip Percentage") and compute the Tip Amount. To retrieve the data in these EditText's, use <b>'.getText()'</b>.</li>
  <li>This method returns an Editable, and to convert it into a String use <b>'.toString()'</b>. You may notice that in order to use our EditText's inside the OnClick method, we have to declare them final, or make them global variables.</li>
  <li>To use these values in our calculations, we must convert them from String to Double. Use the method <b>'Double.parseDouble(param)'</b>, and store these values into variables</li>
  <li>Now you have Double values for both "Total Amount" and "Tip Percentage". With this information, compute the Tip Amount, and store into another <b>Double variable called "tipAmount"</b></li>
  <li>The last step of the process. We need to display the Tip Amount that we just computed. To do this, you must call the <b>'.setText'</b> method on your TextView and pass it our variable "tipAmount" (converted from double to String, of course)</li>
</ul>
<br></br>
<b>Final Code:</b>
<img src="https://snag.gy/jQM1OE.jpg" width="800"></img>
<br></br>

<h2>Takeaways</h2>
  In this tutorial, you learned how to:
<ul>
  <li>Customize your XML components</li>
  <li>Connect XML components to your Java code</li>
  <li>Learned about Anonymous Classes, Global variables, and 'Final'</li>
  <li>Use three different types of components (Button, TextView, EditText) and now can explore other ones</li>
</ul>
<br></br>

<h2>Projects</h2>
  Below are some projects you can try on your own, that you should now be able to do:
<ul>
  <li>Replace the EditText "Tip Percentage" with a SeekBar (Use the Android Studio Documentation for help)</li>
  <li>App where if you click on an image, it displays a caption (Hint: Use ImageButton)</li>
  <li>Calculator App</li>
</ul>
