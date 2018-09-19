# Summary
Welcome to the first Android HackNight project! This project will show you how to create an application that displays "Hello World!" to the screen with Java. Doing this is simple in Android, which makes it a perfect first project because programming Android apps requires more than just knowledge of Java, such as knowledge of Gradle and the Android resource system. We will be talking about those two things in this tutorial. However, this tutorial will assume that you know basic Java.

# Table of Contents
1. [How are Android apps made?](#how-are-android-apps-made)
2. [Installing Android Studio](#installing-android-studio)
3. [Setting up the Project](#setting-up-the-project)
4. [Making Sure It Works](#making-sure-it-works)

# How are Android apps made?

### Java and XML
Android apps are primarily written in Java and XML. Recently, a lot of developers (myself included) have been using Kotlin instead of Java, but this tutorial will only use Java because most people are already familiar with it. If you are curious about Kotlin, [check out this page on the Android website](https://developer.android.com/kotlin/) or ask one of the Android mentors for more information :smiley:

When we go about making an Android app, we primarily need two things: a visual user interface (UI) and some kind of dynamic behavior that responds to input from the user (a program). XML is used to define the UI and Java is used to give our application some kind of behavior. The behavior of our Hello World app is just displaying "Hello, World!" which isn't very dynamic at all but that's ok.

In case anyone is confused, XML isn't a programming language, it's a *markup language*. Markup languages are for telling a computer exactly how some *object* is configured. For Android apps, the objects that we are configuring are Java objects, but markup languages in general can be used to configure literally anything. The important thing to understand is that markup languages don't behave at all on their own, meaning that their configuration will never change unless changed by a human or a program. 

So, in Android apps, we use XML to tell the Android operating system how our app should look (UI). We use Java to tell the Android system which XML file to use as the current display and also to change the UI dynamically, because XML doesn't change at all on its own.

### Gradle
Gradle is a very important part of Android development. Almost all Android applications use Gradle. Gradle is what's known as a *build system*. Build systems manage your dependencies and compile your code for you. 

What do I mean by *manage dependencies*? A dependency is some other program that your app or program relies on to function. Let's say you need to make an app that generates and scans QR codes, but you don't know how to generate a QR code. That would take a lot time to research and program an app that makes QR codes. Instead, you can search around on Google to see if anyone has already made a program that generates QR codes and has also granted permission for other people to use the program in their projects. That way, you could import their program and use it in your Android app to make QR codes. To import their program to be used in your app, you use Gradle.

What do I mean by *compile code*? Like I said earlier, you write Java code when programming an Android app. When you want to install you app on a device or emulator, a couple things happen.
1. All of your Java code (with `.java` file extensions) are compiled into Java byte code (with `.class` file extensions). This is the same thing as writing a simple Java program in Eclipse and compiling/running it with Eclipse or the command `javac`
2. The compiled Java code is then partially reformatted into an Android Application Package (APK) with a `.apk` file extension

Gradle handles all of that for you. Now you can take that `.apk` file, put it on a device or emulator, and run it to install your application. Actually, when using Android Studio, all you have to do is hit `Run` and your application is automatically installed and opened on a specified device or emulator.

# Installing Android Studio
Most Android developers use Android Studio to make applications. Installing Android Studio for Mac and Windows is a breeze. However be warned: it can be sort of annoying on debian Linux and impossible (I think) for other Linux distributions. 

Follow the instructions to download and install Android Studio from the [Android Developer Website](https://developer.android.com/studio/)

# Setting up the Project
1. Open Android Studio and hit "Start a new Android Studio project" ![Android Studio Start Screen](https://snag.gy/aBuRGd.jpg)
2. A window should have popped up. Change the field "Application Name" to be "Hello World" (this is optional). "Company domain" doesn't matter right now, you can change it or leave it as whatever the default is for you (in my case, the default is `com.example`). Change "Project location" to be wherever you want the project folder to be created. Don't change "Package Name". Also make sure that "Include Kotlin Support" and "Include C++ Support" are NOT checked. In short, make it look like this and click "Next" ![Configure New Project Screen](https://snag.gy/0XOSAr.jpg)
3. On the next screen, make sure that only the "Phone and Tablet" checkbox is checked. Click the dropdown under that checkbox and choose "API 21: Android 5.0 (Lollipop)". Make sure that "Include Android Instant App Support" is NOT checked. Click "Next" ![SDK Configuration Page](https://snag.gy/8xZqYo.jpg)
4. On the next screen, choose "Empty Activity" and press "Next" ![Default Activity Selection Screen](https://snag.gy/QABbpL.jpg)
5. On the next screen, you shouldn't have to change anything. Keep the defaults as long as they are the same as the picture below and click "Finish". ("Activity Name" should be set to "MainActivity", "Generate Layout File" should be checked, "Layout Name" should be "activity_main", and "Backwards Compatability (App Compat)" should be checked) ![Activity and Layout Naming Screen](https://snag.gy/3r7KJt.jpg)

Now Android Studio will generate a new project for you. It will take anywhere between 15 seconds to a few minutes depending on your computer.

Ok, you've just seen a whole bunch of stuff that we haven't talked about yet. What's an activity? What's an Android API level? What's AppCompat?. Dont' worry, we'll talk about all that in detail later. If you're impatient or you just don't like reading, feel free to reach out to an RUMAD Android mentor! :smiley:

# Making Sure It Works
At this point, the Hello World app is actually done. Sorry, I know it's a little anti-climactic. However, if we wanted to make changes (for example, making the app say "Hello, Humans") we wouldn't be able to do so very easily because of a recent bug in the Android Support Library. 
