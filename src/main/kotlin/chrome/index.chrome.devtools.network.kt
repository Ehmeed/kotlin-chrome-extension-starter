//@file:JsQualifier("chrome.devtools.network")
//@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
//package chrome.devtools.network
//
//import kotlin.js.*
//import kotlin.js.Json
//import org.khronos.webgl.*
//import org.w3c.dom.*
//import org.w3c.dom.events.*
//import org.w3c.dom.parsing.*
//import org.w3c.dom.svg.*
//import org.w3c.dom.url.*
//import org.w3c.fetch.*
//import org.w3c.files.*
//import org.w3c.notifications.*
//import org.w3c.performance.*
//import org.w3c.workers.*
//import org.w3c.xhr.*
//import chrome.events.Event
//
//external interface HAREntry : HARFormatEntry
//
//external interface HARLog : HARFormatLog
//
//external interface Request : HAREntry {
//    fun getContent(callback: (content: String, encoding: String) -> Unit)
//}
//
//external interface RequestFinishedEvent : Event<(request: Request) -> Unit>
//
//external interface NavigatedEvent : Event<(url: String) -> Unit>
//
//external fun getHAR(callback: (harLog: HARLog) -> Unit)
//
//external var onRequestFinished: RequestFinishedEvent
//
//external var onNavigated: NavigatedEvent
