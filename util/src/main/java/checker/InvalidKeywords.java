package checker;

public final class InvalidKeywords {
    private static final String[] invalidWords;


    static {
        invalidWords = new String[]
                {
                        "fuck",
                        "shit",
                        "bitch",
                        "asshole",
                        "dick",
                        "pussy",
                        "slut",
                        "whore",
                        "cunt",
                        "motherfucker",
                        "nigger", // Extremely offensive racial slur
                        "faggot", // Derogatory term for homosexuals
                        "cocksucker",
                        "bastard",
                        "twat",
                        "prick",
                        "douchebag",
                        "retard", // Considered derogatory and offensive
                        "hate",
                        "violence",
                        "kill",
                        "terrorist",
                        "piss",
                        "damn",
                        "screw",
                        "ass",
                        "nazi",
                        "whore",
                        "freak",
                        "bimbo",
                        "crap",
                        "boob",
                        "tit",
                        "slutty",
                        "skinhead",
                        "chink", // Racial slur
                        "spic", // Racial slur
                        "wetback", // Racial slur
                        "gook", // Racial slur
                        "coon", // Racial slur
                        "dyke",
                        "fistfuck",
                        "asswipe",
                        "shag",
                        "sodomize",
                        "bitchslap",
                        "blowjob",
                        "ballsy",
                        "clit",
                        "cock",
                        "cum",
                        "dike",
                        "fart",
                        "freak",
                        "homo",
                        "jackass",
                        "kike", // Anti-Semitic term
                        "muff",
                        "nerd",
                        "pecker",
                        "pisshead",
                        "prude",
                        "queer",
                        "scumbag",
                        "scrote",
                        "suck",
                        "turd",
                        "wanker",
                        "wimp",
                        "wop", // Racial slur
                        "crackhead",
                        "pothead",
                        "junkie",
                        "slutbag",
                        "bastardize",
                        "bitching",
                        "bloodsucker",
                        "pork",
                        "roadkill",
                        "screamer",
                        "skank",
                        "spaz",
                        "skank",
                        "chode",
                        "dumbass",
                        "loser",
                        "moron",
                        "retard",
                        "dumb",
                        "fool",
                        "idiot",
                        "jackass",
                        "puke",
                        "shithead",
                        "snot",
                        "whine",
                        "wrinkle",
                        "zoophilia"};
    }

    public static boolean containsInvalidKeywords(String name) {
        for (String illegalKeyword : invalidWords)
            if (illegalKeyword.equalsIgnoreCase(name))
                return false;

        return true;
    }
}
