class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        // takes a boolean value
        // return 'true' if knight is sleeping
        // false if knight is awake
        if (knightIsAwake) {
            return false;
        } else {
        return true;
        }
        }


    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // return true if the group can be spied upon
        // can be spied upon if at least one is awake
        if (!knightIsAwake && !archerIsAwake && !prisonerIsAwake) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // return true if prisoner can be signalled
        // can signal prisoner is prison is awake and archer is sleeping
        return prisonerIsAwake && !archerIsAwake;
    }


    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {

        // can free prisoner if:
            // if A has dog + archer is asleep
            // if A does not have dog  + prisoner is awake + knight & archer are asleep
        if (petDogIsPresent && !archerIsAwake){
            return true;
        } else if (!petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
            return true;
        } else {
            return false;
        }
    }
}
