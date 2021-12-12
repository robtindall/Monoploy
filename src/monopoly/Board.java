package monopoly;

import static monopoly.PropertyType.*;

public class Board {

    static Place[] places = {
            new Place("GO"),
            new Property("OLD KENT ROAD", Brown),
            new Place("COMMUNITY CHEST"),
            new Property("WHITECHAPEL ROAD", Brown),
            new Tax("INCOME TAX", 200),
            new Property("KINGS CROSS STATION *", Station),
            new Property("THE ANGEL ISLINGTON", LightBlue),
            new Place("CHANCE"),
            new Property("EUSTON ROAD", LightBlue),
            new Property("PENTONVILLE ROAD", LightBlue),
            new Place("JAIL"),
            new Property("PALL MALL", Pink),
            new Property("ELECTRIC COMPANY", Utility),
            new Property("WHITEHALL", Pink),
            new Property("NORTHUMBERL'D AVENUE", Pink),
            new Property("MARYLEBONE STATION *", Station),
            new Property("BOW STREET", Orange),
            new Place("COMMUNITY CHEST"),
            new Property("MARLBOROUGH STREET", Orange),
            new Property("VINE STREET", Orange),
            new Place("FREE PARKING"),
            new Property("STRAND", Red),
            new Place("CHANCE"),
            new Property("FLEET STREET", Red),
            new Property("TRAFALGAR SQUARE", Red),
            new Property("FENCHURCH ST. STATION *", Station),
            new Property("LEICESTER SQUARE", Yellow),
            new Property("COVENTRY STREET", Yellow),
            new Property("WATER WORKS", Utility),
            new Property("PICCADILLY", Yellow),
            new GoToJail("GO TO JAIL"),
            new Property("REGENT STREET", Green),
            new Property("OXFORD STREET", Green),
            new Place("COMMUNITY CHEST"),
            new Property("BOND STREET", Green),
            new Property("LIVERPOOL ST. STATION *", Station),
            new Place("CHANCE"),
            new Property("PARK LANE", DarkBlue),
            new Tax("SUPERTAX", 100),
            new Property("MAYFAIR", DarkBlue)
    };
}
