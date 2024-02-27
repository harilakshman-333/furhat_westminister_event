package furhatos.app.lak1.flow.main

import furhatos.app.lak1.flow.Parent
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Greeting: State = state(Parent) {
    onEntry {
        furhat.say("Welcome to the Churchill Room for the launch of the National Robotarium policy paper.\n" +
                " \n" +
                "I'm FurHat, your robot-receptionist. I hope you enjoy our event")
    }
//
//    onResponse<Yes> {
//        furhat.say("Hello World! ")
//    }
//
//    onResponse<No> {
//        furhat.say("Ok.")
//    }

}

