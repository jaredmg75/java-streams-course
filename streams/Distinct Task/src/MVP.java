import java.util.Arrays;
import java.util.List;

/**
 * NBA Most Valuable Player Award
 */
public class MVP {
  public static final List<MVP> mostValuablePlayers = Arrays.asList(
      new MVP(1956, "Bob Pettit", "Power forward", "United States", "St.Louis Hawks", 34_000),
      new MVP(1957, "Bob Cousy", "Point guard", "United States", "Boston Celtics", 44_000),
      new MVP(1958, "Bill Russell", "Center", "United States", "Boston Celtics", 43_000),
      new MVP(1959, "Bob Pettit", "Power forward", "United States", "St.Louis Hawks", 52_000),
      new MVP(1960, "Wilt Chamberlain", "Center", "United States", "Philadelphia Warriors", 51_000),
      new MVP(1961, "Bill Russell", "Center", "United States", "Boston Celtics", 63_000),
      new MVP(1962, "Bill Russell", "Center", "United States", "Boston Celtics", 82_000),
      new MVP(1963, "Bill Russell", "Center", "United States", "Boston Celtics", 82_000),
      new MVP(1964, "Oscar Robertson", "Point guard", "United States", "Cincinnati Royals", 101_000),
      new MVP(1965, "Bill Russell", "Center", "United States", "Boston Celtics", 110_000),
      new MVP(1966, "Wilt Chamberlain", "Center", "United States", "Philadelphia 76ers", 141_000),
      new MVP(1967, "Wilt Chamberlain", "Center", "United States", "Philadelphia 76ers", 156_000),
      new MVP(1968, "Wilt Chamberlain", "Center", "United States", "Philadelphia 76ers", 190_000),
      new MVP(1969, "Wes Unseld", "Center/Forward", "United States", "Baltimore Bullets", 200_000),
      new MVP(1970, "Willis Reed", "Center", "United States", "New York Knicks", 185_000),
      new MVP(1971, "Lew Alcindor", "Center", "United States", "Milwaukee Bucks", 230_000),
      new MVP(1972, "Kareem Abdul-Jabbar", "Center", "United States", "Milwaukee Bucks", 210_000),
      new MVP(1973, "Dave Cowens", "Center", "United States", "Boston Celtics", 250_000),
      new MVP(1974, "Kareem Abdul-Jabbar", "Center", "United States", "Milwaukee Bucks", 244_000),
      new MVP(1975, "Bob McAdoo", "Power forward", "United States", "Buffalo Braves)", 220_000),
      new MVP(1976, "Kareem Abdul-Jabbar", "Center", "United States", "Los Angeles Lakers", 290_000),
      new MVP(1977, "Kareem Abdul-Jabbar", "Center", "United States", "Los Angeles Lakers", 310_000),
      new MVP(1978, "Bill Walton", "Center", "United States", "Portland Trail Blazers", 340_000),
      new MVP(1979, "Moses Malone", "Center", "United States", "Houston Rockets", 290_000),
      new MVP(1980, "Kareem Abdul-Jabbar", "Center", "United States", "Los Angeles Lakers", 350_000),
      new MVP(1981, "Julius Erving", "Small forward", "United States", "Philadelphia 76ers", 360_000),
      new MVP(1982, "Moses Malone", "Center", "United States", "Houston Rockets", 390_000),
      new MVP(1983, "Moses Malone", "Center", "United States", "Philadelphia 76ers", 400_000),
      new MVP(1984, "Larry Bird", "Small forward", "United States", "Boston Celtics", 440_000),
      new MVP(1985, "Larry Bird", "Small forward", "United States", "Boston Celtics", 460_000),
      new MVP(1986, "Larry Bird", "Small forward", "United States", "Boston Celtics", 460_000),
      new MVP(1987, "Magic Johnson", "Point guard", "United States", "Los Angeles Lakers", 440_000),
      new MVP(1988, "Michael Jordan", "Shooting guard", "United States", "Chicago Bulls)", 465_000),
      new MVP(1989, "Magic Johnson", "Point guard", "United States", "Los Angeles Lakers", 550_000),
      new MVP(1990, "Magic Johnson", "Point guard", "United States", "Los Angeles Lakers", 840_000),
      new MVP(1991, "Michael Jordan", "Shooting guard", "United States", "Chicago Bulls", 950_000),
      new MVP(1992, "Michael Jordan", "Shooting guard", "United States", "Chicago Bulls", 1_100_000),
      new MVP(1993, "Charles Barkley", "Power forward", "United States", "Phoenix Suns)", 1_300_000),
      new MVP(1994, "Hakeem Olajuwon", "Center", "Nigeria", "Houston Rockets", 1_340_000),
      new MVP(1995, "David Robinson", "Center", "United States", "San Antonio Spurs)", 1_400_000),
      new MVP(1996, "Michael Jordan", "Shooting guard", "United States", "Chicago Bulls", 1_800_000),
      new MVP(1997, "Karl Malone", "Power forward", "United States", "Utah Jazz)", 2_200_000),
      new MVP(1998, "Michael Jordan", "Shooting guard", "United States", "Chicago Bulls", 2_100_000),
      new MVP(1999, "Karl Malone", "Power forward", "United States", "Utah Jazz", 3_100_000),
      new MVP(2000, "Shaquille O'Neal", "Center", "United States", "Los Angeles Lakers", 3_200_000),
      new MVP(2001, "Allen Iverson", "Shooting guard", "United States", "Philadelphia 76ers", 3_300_000),
      new MVP(2002, "Tim Duncan", "Power forward", "United States", "San Antonio Spurs", 3_400_000),
      new MVP(2003, "Tim Duncan", "Power forward", "United States", "San Antonio Spurs", 3_500_000),
      new MVP(2004, "Kevin Garnett", "Power forward", "United States", "Minnesota Timberwolves", 3_600_000),
      new MVP(2005, "Steve Nash", "Point guard", "Canada", "Phoenix Suns", 3_800_000),
      new MVP(2006, "Steve Nash", "Point guard", "Canada", "Phoenix Suns", 3_900_000),
      new MVP(2007, "Dirk Nowitzki", "Power forward", "Germany", "Dallas Mavericks", 4_000_000),
      new MVP(2008, "Kobe Bryant", "Shooting guard", "United States", "Los Angeles Lakers", 4_000_000),
      new MVP(2009, "LeBron James", "Small forward", "United States", "Cleveland Cavaliers)", 4_300_000),
      new MVP(2010, "LeBron James", "Small forward", "United States", "Cleveland Cavaliers", 4_400_000),
      new MVP(2011, "Derrick Rose", "Point guard", "United States", "Chicago Bulls", 4_600_000),
      new MVP(2012, "LeBron James", "Small forward", "United States", "Miami Heat)", 4_700_000),
      new MVP(2013, "LeBron James", "Small forward", "United States", "Miami Heat", 4_900_000),
      new MVP(2014, "Kevin Durant", "Small forward", "United States", "Oklahoma City Thunder)", 4_000_000),
      new MVP(2015, "Stephen Curry", "Point guard", "United States", "Golden State Warriors", 5_000_000),
      new MVP(2016, "Stephen Curry", "Point guard", "United States", "Golden State Warriors", 6_000_000),
      new MVP(2017, "Russell Westbrook", "Point guard", "United States", "Oklahoma City Thunder", 7_000_000),
      new MVP(2018, "James Harden", "Shooting guard", "United States", "Houston Rockets", 10_000_000));

  private int year;
  private String position;
  private String nationality;
  private String name;
  private String team;
  private int salary;

  public MVP(int year, String name, String position, String nationality, String team, int salary) {
    this.year = year;
    this.name = name;
    this.position = position;
    this.nationality = nationality;
    this.team = team;
    this.salary = salary;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return name;
  }
}
