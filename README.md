# SGui (Server Gui)
It's a small, jij-able library that allows creation of server side guis.

## Usage:
Put the jar file into `./libs/` folder, and  
add it to your dependencies like this:

```
repositories {
    flatDir { dir 'libs' }
}

dependencies {
	modImplementation include("cn.chloeprime:sgui:[TAG]")
}
```

After that you are ready to go! You can use SimpleGUI and other classes directly for simple ones or extend
them for more complex guis.~~