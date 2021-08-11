class Use_Football_Team {
    /*インスタンス化*/
    public static void main(String[] args){
        Football_Team brazil = new Football_Team("Brazil", 73, 18, 18);
        Football_Team italy = new Football_Team("Italy", 45, 21, 21);
        Football_Team argentina = new Football_Team("Argentina", 43, 15, 15);
        Football_Team west_germany = new Football_Team("West_Germany", 36, 14, 14);
        Football_Team france = new Football_Team("France", 34, 13, 13);
        Football_Team germany = new Football_Team("Germany", 31, 6, 6);
        Football_Team spanish = new Football_Team("Spanish", 30, 15, 15);
        /*勝敗情報の表示 */
        brazil.show_team_result();
        italy.show_team_result();
        argentina.show_team_result();
        west_germany.show_team_result();
        france.show_team_result();
        germany.show_team_result();
        spanish.show_team_result();
    }
}