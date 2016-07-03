package test.utils;

/**
 * @author Neil Stevenson
 */
public class Oscars {

	// https://en.wikipedia.org/wiki/Academy_Award_for_Best_Actor
	public static final Object[][] bestActors = { { 1928, "Emil", "Jannings" }, { 1929, "Warner", "Baxter" },
			{ 1930, "George", "Arliss" }, { 1931, "Lionel", "Barrymore" }, { 1932, "Wallace", "Beery" },
			{ 1933, "Charles", "Laughton" }, { 1934, "Clark", "Gable" }, { 1935, "Victor", "McLaglen" },
			{ 1936, "Paul", "Muni" }, { 1937, "Spencer", "Tracy" }, { 1938, "Spencer", "Tracy" },
			{ 1939, "Robert", "Donat" }, { 1940, "James", "Stewart" }, { 1941, "Gary", "Cooper" },
			{ 1942, "James", "Cagney" }, { 1943, "Paul", "Lukas" }, { 1944, "Bing", "Crosby" },
			{ 1945, "Ray", "Milland" }, { 1946, "Fredric", "March" }, { 1947, "Ronald", "Colman" },
			{ 1948, "Laurence", "Olivier" }, { 1949, "Broderick", "Crawford" }, { 1950, "Jose", "Ferrer" },
			{ 1951, "Humphrey", "Bogart" }, { 1952, "Gary", "Cooper" }, { 1953, "William", "Holden" },
			{ 1954, "Marlon", "Brando" }, { 1955, "Ernest", "Borgnine" }, { 1956, "Yul", "Brynner" },
			{ 1957, "Alec", "Guinness" }, { 1958, "David", "Niven" }, { 1959, "Charlton", "Heston" },
			{ 1960, "Burt", "Lancaster" }, { 1961, "Maximilian", "Schell" }, { 1962, "Gregory", "Peck" },
			{ 1963, "Sidney", "Poitier" }, { 1964, "Rex", "Harrison" }, { 1965, "Lee", "Marvin" },
			{ 1966, "Paul", "Scofield" }, { 1967, "Rod", "Steiger" }, { 1968, "Cliff", "Robertson" },
			{ 1969, "John", "Wayne" }, { 1970, "George", "Scott" }, { 1971, "Gene", "Hackman" },
			{ 1972, "Marlon", "Brando" }, { 1973, "Jack", "Lemmon" }, { 1974, "Art", "Carney" },
			{ 1975, "Jack", "Nicholson" }, { 1976, "Peter", "Finch" }, { 1977, "Richard", "Dreyfuss" },
			{ 1978, "Jon", "Voight" }, { 1979, "Dustin", "Hoffman" }, { 1980, "Robert", "De Niro" },
			{ 1981, "Henry", "Fonda" }, { 1982, "Ben", "Kingsley" }, { 1983, "Robert", "Duvall" },
			{ 1984, "Murray", "Abraham" }, { 1985, "William", "Hurt" }, { 1986, "Paul", "Newman" },
			{ 1987, "Michael", "Douglas" }, { 1988, "Dustin", "Hoffman" }, { 1989, "Daniel", "Day-Lewis" },
			{ 1990, "Jeremy", "Irons" }, { 1991, "Anthony", "Hopkins" }, { 1992, "Al", "Pacino" },
			{ 1993, "Tom", "Hanks" }, { 1994, "Tom", "Hanks" }, { 1995, "Nicolas", "Cage" },
			{ 1996, "Geoffrey", "Rush" }, { 1997, "Jack", "Nicholson" }, { 1998, "Roberto", "Benigni" },
			{ 1999, "Kevin", "Spacey" }, { 2000, "Russell", "Crowe" }, { 2001, "Denzel", "Washington" },
			{ 2002, "Adrien", "Brody" }, { 2003, "Sean", "Penn" }, { 2004, "Jamie", "Foxx" },
			{ 2005, "Philip", "Seymour" }, { 2006, "Forest", "Whitaker" }, { 2007, "Daniel", "Day-Lewis" },
			{ 2008, "Sean", "Penn" }, { 2009, "Jeff", "Bridges" }, { 2010, "Colin", "Firth" },
			{ 2011, "Jean", "Dujardin" }, { 2012, "Daniel", "Day-Lewis" }, { 2013, "Mathew", "McConaughey" },
			{ 2014, "Eddie", "Redmayne" }, { 2015, "Leonardo", "DiCaprio" }, };

	// https://en.wikipedia.org/wiki/Academy_Award_for_Best_Picture
	public static final Object[][] bestPictures = { { 1928, "Wings" }, { 1929, "The Broadway Melody" },
			{ 1930, "All Quiet On The Western Front" }, { 1931, "Cimarron" }, { 1932, "Grand Hotel" },
			{ 1933, "Cavalcade" }, { 1934, "It Happened One Night" }, { 1935, "Mutiny On The Bounty" },
			{ 1936, "The Great Ziegfeld" }, { 1937, "The Life Of Emile Zola" }, { 1938, "You Can't Take It With You" },
			{ 1939, "Gone With The Wind" }, { 1940, "Rebecca" }, { 1941, "How Green Was My Valley" },
			{ 1942, "Mrs Miniver" }, { 1943, "Casablanca" }, { 1944, "Going My Way" }, { 1945, "The Lost Weekend" },
			{ 1946, "The Best Years Of Our Lives" }, { 1947, "Gentleman's Agreement" }, { 1948, "Hamlet" },
			{ 1949, "All The King's Men" }, { 1950, "All About Eve" }, { 1951, "An American In Paris" },
			{ 1952, "The Greatest Show On Earth" }, { 1953, "From Here To Eternity" }, { 1954, "On The Waterfront" },
			{ 1955, "Marty" }, { 1956, "Around The World In 80 Days" }, { 1957, "The Bridge On The River Kwai" },
			{ 1958, "Gigi" }, { 1959, "Ben-Hur" }, { 1960, "The Aprtment" }, { 1961, "West Side Story" },
			{ 1962, "Lawrence Of Arabia" }, { 1963, "Tom Jones" }, { 1964, "My Fair Lady" },
			{ 1965, "The Sound Of Music" }, { 1966, "A Man For All Seasons" }, { 1967, "In The Heat Of The Night" },
			{ 1968, "Oliver!" }, { 1969, "Midnight Cowboy" }, { 1970, "Patton" }, { 1971, "The French Connection" },
			{ 1972, "The Godfather" }, { 1973, "The Sting" }, { 1974, "The Godfather Part II" },
			{ 1975, "One Flew Over The Cuckoo's Nest" }, { 1976, "Rocky" }, { 1977, "Annie Hall" },
			{ 1978, "The Deer Hunter" }, { 1979, "Kramer vs Kramer" }, { 1980, "Ordinary People" },
			{ 1981, "Chariots Of Fire" }, { 1982, "Gandhi" }, { 1983, "Terms Of Endearment" }, { 1984, "Amadeus" },
			{ 1985, "Out Of Adrica" }, { 1986, "Platoon" }, { 1987, "The Last Emporor" }, { 1988, "Rain Man" },
			{ 1989, "Driving Miss Daisy" }, { 1990, "Dances With Wolves" }, { 1991, "The Silence Of The Lambs" },
			{ 1992, "Unforgiven" }, { 1993, "Schindler's List" }, { 1994, "Forrest Gump" }, { 1995, "Braveheart" },
			{ 1996, "The English Patient" }, { 1997, "Titanic" }, { 1998, "Shakespeare In Love" },
			{ 1999, "American Beauty" }, { 2000, "Gladiator" }, { 2001, "A Beatiful Mind" }, { 2002, "Chicago" },
			{ 2003, "The Lord Of The Rings: The Return Of The King" }, { 2004, "Million Dollar Baby" },
			{ 2005, "Crash" }, { 2006, "The Departed" }, { 2007, "No Country For Old Men" },
			{ 2008, "Slumdog Millionaire" }, { 2009, "The Hurt Locker" }, { 2010, "The King's Speech" },
			{ 2011, "The Artist" }, { 2012, "Argo" }, { 2013, "12 Years A Slave" }, { 2014, "Birdman" },
			{ 2015, "Spotlight" }, };

	// https://en.wikipedia.org/wiki/Academy_Award_for_Best_Original_Song
	public static final Object[][] bestSongs = { { 1934, "The Continental" }, { 1935, "Lullaby Of Broadway" },
			{ 1936, "The Way You Look Tonight" }, { 1937, "Sweet Leilani" }, { 1938, "Thanks For The Memory" },
			{ 1939, "Over The Rainbow" }, { 1940, "When You Wish Upon A Star" }, { 1941, "The Last Time I Saw Paris" },
			{ 1942, "White Christmas" }, { 1943, "You'll Never Know" }, { 1944, "Swinging On A Star" },
			{ 1945, "It Might As Well Be Spring" }, { 1946, "On The Atchison, Topeka And The Santa Fe" },
			{ 1947, "Zip-A-Dee-Doo-Dah" }, { 1948, "Buttons And Bows" }, { 1949, "Baby, It's Cold Outside" },
			{ 1950, "Mona Lisa" }, { 1951, "In The Cool Cool, Cool Of The Evening" }, { 1952, "High Noon" },
			{ 1953, "Secret Love" }, { 1954, "Three Coins In A Foutain" }, { 1955, "Love Is A Many Splendored Thing" },
			{ 1956, "Whatever Will Be, Will Be" }, { 1957, "All The Way" }, { 1958, "Gigi" }, { 1959, "High Hopes" },
			{ 1960, "Never On Sunday" }, { 1961, "Moon River" }, { 1962, "Days Of Wine And Roses" },
			{ 1963, "Call Me Irresponsible" }, { 1964, "Chim Chim Cher-ee" }, { 1965, "The Shadow Of Your Smile" },
			{ 1966, "Born Free" }, { 1967, "Talk To The Animals" }, { 1968, "The Windmills Of Your Mind" },
			{ 1969, "Raindrops Keep Fallin' On My Head" }, { 1970, "For All We Know" }, { 1971, "Shaft" },
			{ 1972, "The Morning After" }, { 1973, "The Way We Were" }, { 1974, "We May Never Love Like This Again" },
			{ 1975, "I'm Easy" }, { 1976, "Evergreen" }, { 1977, "You Light Up My Life" }, { 1978, "Last Dance" },
			{ 1979, "It Goes Like It Goes" }, { 1980, "Fame" }, { 1981, "Arthur's Theme" },
			{ 1982, "Up Where We Belong" }, { 1983, "Flashdance" }, { 1984, "I just Called To Say I Love You" },
			{ 1985, "Say You Say Me" }, { 1986, "Take My Breath Away" }, { 1987, "The Time Of My Life" },
			{ 1988, "Let The River Run" }, { 1989, "Under The Sea" }, { 1990, "Sooner Or Later" },
			{ 1991, "Beauty And The Beast" }, { 1992, "A Whole New World" }, { 1993, "Streets Of Philadelphia" },
			{ 1994, "Can You Feel The Love Tonight" }, { 1995, "Colors Of The Wind" }, { 1996, "You Must Love Me" },
			{ 1997, "My Heart Will Go On" }, { 1998, "When You Believe" }, { 1999, "You'll Be In My Heart" },
			{ 2000, "Things Have Changed" }, { 2001, "If I Didn't Have You" }, { 2002, "Lose Yourself" },
			{ 2003, "Into The West" }, { 2004, "Al Otro Lada Del Rio" }, { 2005, "It's Hard Out Here For A Pimp" },
			{ 2006, "I Need To Wake Up" }, { 2007, "Falling Slowly" }, { 2008, "Jai Ho" }, { 2009, "The Weary Kind" },
			{ 2010, "We Belong Together" }, { 2011, "Man Or Muppet" }, { 2012, "Skyfall" }, { 2013, "Let It Go" },
			{ 2014, "Glory" }, { 2015, "Writing's On The Wall" }, };

}
