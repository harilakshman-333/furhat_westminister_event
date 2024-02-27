package furhatos.app.lak1

import furhatos.app.lak1.flow.Init
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class Lak1Skill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
