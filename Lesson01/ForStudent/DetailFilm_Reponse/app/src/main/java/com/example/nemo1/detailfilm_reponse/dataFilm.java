package com.example.nemo1.detailfilm_reponse;

import java.util.ArrayList;
import java.util.List;

public class dataFilm {
    private List<eFilm> eFilmList;

    public List<eFilm> geteFilmList() {
        eFilmList = new ArrayList<>();
        eFilm eFilm = new eFilm(R.mipmap.darkspiderman,"Spider Man","\"Spider-Man\" centers on student Peter Parker (Tobey Maguire) who, after being bitten by a genetically-altered spider, gains superhuman strength and the spider-like ability to cling to any surface. He vows to use his abilities to fight crime, coming to understand the words of his beloved Uncle Ben: \"With great power comes great responsibility.\"","6.0","2013","DH");
        eFilm eFilm1 = new eFilm(R.mipmap.guardianofthegalaxy,"Guardian Of The Galaxy","Brash space adventurer Peter Quill (Chris Pratt) finds himself the quarry of relentless bounty hunters after he steals an orb coveted by Ronan, a powerful villain. To evade Ronan, Quill is forced into an uneasy truce with four disparate misfits: gun-toting Rocket Raccoon, treelike-humanoid Groot, enigmatic Gamora, and vengeance-driven Drax the Destroyer. But when he discovers the orb's true power and the cosmic threat it poses, Quill must rally his ragtag group to save the universe.","6.0","2013","DH");
        eFilm eFilm2 = new eFilm(R.mipmap.killer,"Tueurs","The film tells the story of Frank Valken, a notorious robber who easily commit a last great assault. Or that he thinks at least - Valken and his gang are involved in a crime case of thirty years ago and are the perfect suspects for the murder command that is back with a vengeance.","6.0","2013","DH");
        eFilm eFilm3= new eFilm(R.mipmap.panthernoire,"Panther","T'Challa, heir to the hidden but advanced kingdom of Wakanda, must step forward to lead his people into a new future and must confront a challenger from his country's past.","6.0","2013","DH");
        eFilm eFilm4 = new eFilm(R.mipmap.ava,"Ava","Ava's life is dictated by rules. Coming of age in Iran, she faces pressure to conform to the expectations of her parents, her school, and her friends. When Ava learns that her parents were once flagrant rule breakers themselves, she begins to rebel against the very foundations of her society. AVA masterfully demonstrates how a culture of authority can force denial and detachment, particularly among young women during their formative yet vulnerable high school years.","6.0","2013","DH");
        eFilm eFilm5 = new eFilm(R.mipmap.matilda,"Matilda","Matilda Anna Ingrid Lutz was born in Milan, Italy to two former fashion models and until the age of five, grew up in the little country town of Gudo Visconti. Her American father, Elliston, became a famed fashion photographer, while her mother, Maria, went on to do PR for a fashion press office. Unfortunately, they divorced when Matilda was five ...","6.0","2013","DH");
        eFilm eFilm6 = new eFilm(R.mipmap.insiders,"Insider","A former political henchman seeks out revenge for being dropped by a ruthless politician while a determined investigator tries to find proof of a connection between the two of them.","6.0","2013","DH");

        eFilmList.add(eFilm);
        eFilmList.add(eFilm1);
        eFilmList.add(eFilm2);
        eFilmList.add(eFilm3);
        eFilmList.add(eFilm4);
        eFilmList.add(eFilm5);
        eFilmList.add(eFilm6);

        return eFilmList;
    }
}
