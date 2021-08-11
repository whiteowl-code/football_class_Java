// Football_Teamクラス
class Football_Team {
    // フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;
    // 引数ありコンストラクタ
    public Football_Team(String name, int win, int lose, int draw){
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }
    /*国名メソッド*/
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    /*勝数メソッド*/
    public int getWin(){
        return this.win;
    }
    public void setWin(int win){
        this.win = win;
    }
    /*負数メソッド*/
    public int getLose(){
        return this.lose ;
    }
    public void setLose(int lose){
        this.lose = lose;
    }
    /*引き分けメソッド*/
    public int getDraw(){
        return this.draw;
    }
    public void setDraw(int draw){
        this.draw = draw;
    }
    /* 勝率計算メソッド*/
    public double calc_win_rate(){
        double rate = (double)win / (win + lose);
        return rate;
    }
    /*結果を表示するメソッド */
    public void show_team_result(){
        System.out.println(String.format("%-12s", getName()) 
        + String.format("%3d", getWin()) + String.format("%3d", getLose()) 
        + String.format("%3d", getDraw()) + " "+ String.format("%.3f", calc_win_rate()));
    }
}