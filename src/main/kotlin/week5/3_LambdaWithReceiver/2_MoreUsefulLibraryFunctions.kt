package week5.`3_LambdaWithReceiver`


/*
    - with

    with(window) {
        width = 300
        height = 200
    }

     - run : like with, but extension

     val windowOrNull = windowById["main"]
     windowById["main"]?.run {
        width = 300
        height = 200
     }

     -apply: returns receiver as a result

     val mainWindow =
        windowById["main"]?.apply {
            width = 300
            height = 200
        } ?: return

    - also: regular argument instead of this

    windowById["main"]?.apply{
            width = 300
    }?.also {
        showWindow(it)
        // window -> showWindow(window)
    }
 */



class `2_MoreUsefulLibraryFunctions` {
}