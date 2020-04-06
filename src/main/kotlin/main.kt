import kotlin.browser.document

fun main() {
    document.write("Hello, world!")
    chrome.tabs.onCreated.addListener {
        console.log("Added tab id: ${it.id}")
    }
}
