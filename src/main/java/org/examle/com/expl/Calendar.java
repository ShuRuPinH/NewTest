package org.examle.com.expl;

class Calendar {
 static String Frst;
 int ZZZ;
    static int dINmob=0;
    public Day cur ;
    Calendar(){}

    enum Day{

        MON (1),
        TUE (2),
        WED (3),
        THU (4),
        FRI (5),
        SAT (6),
        SUN (7),
        NAN (0);

        int d;

        Day (int d){
            this.d=d;
        }
        public static Day byNum(int num){

            for (Day n : values())
                if (n.d==num) return n;
            return NAN;
        }}
    enum Month{
        JAN (1,31),
        FEB (2,28),
        MAR (3,31),
        APR (4,30),
        MAY (5,31),
        JUN (6,30),
        JUL (7,31),
        AUG (8,31),
        SEP (9,30),
        OCT (10,31),
        NOV (11,30),
        DEC (12,31),
        NAN (44,44);

        int n;
        int ds;

        Month (int n,int ds){
            this.n=n; this.ds=ds;
        }
        public static Month byNum(int num){
            for (Month n : values())
                if (n.n==num) return n;
            return NAN;
        }

        public static int DaysBN(int num) {
            for (Month n : values()) {
                if (n.n == num) return n.ds;
            }
            return 0;
        }}
    class MMYY  {
        int mm=07;
        int yy=1982;

        public MMYY(int mm, int yy) {
            this.mm = mm;
            this.yy = yy;
        }

        int getMY(int a){
            if (a==0) return mm;
            if (a==1) return yy;
            else return 2222;
        }
    }

    // Определяет число дней в месяце
    int dInMon(int mm,double yyyy){
        int temp=Month.DaysBN(mm);

        if (mm==2){ if (yyyy %4==0 || yyyy %400 ==0) temp=29;
            if (yyyy %100==0) temp=28;
            else temp=28;}
        return temp;
    }
    // ВВОД 2 СТРОКАМИ НИЖЕ ;)
    public static void main(String[] args) {

        MMYY mmain= null;
        int mm=mmain.getMY(0);
        int yyyy =mmain.getMY(1);


        dINmob=new Calendar().dInMon(mm,yyyy);
        Frst =(" "+Month.byNum(mm)+"_"+yyyy+"   (1st - "+ Day.byNum(Fst(mm,yyyy))+" & "+dINmob+" days)");
        System.out.println(Frst);

       print(mm,yyyy);


    }
    // формирует строку календаря
    public static  String calendStr(Day d,int f){
        Integer fi=f-6;
        String ws5="\u00A0\u00A0";
        String ws6="\u00A0\u00A0";
        String fs="\u00A0\u00A0";

        if (fi>0)fs=Integer.toString(fi);
        Integer ww5=(fi+28);
        if (ww5<=dINmob) ws5=Integer.toString(ww5);
        Integer ww6=(fi+35);
        if (ww6<=dINmob) ws6=Integer.toString(ww6);
        //        return
        //String str[]= {String.valueOf(d),"\t\t",fs,"  ", String.valueOf((fi+7)),"  ", String.valueOf((fi+14)),"  ", String.valueOf((fi+21)),"  ",ws5,"  ",ws6} ;
        System.out.println(d+"    "+fs+"  "+(fi+7)+"  "+(fi+14)+"  "+(fi+21)+"  "+ws5+"  "+ws6);
        return "\u00A0\u00A0\u00A0\u00A0"+fs+"\u00A0\u00A0"+(fi+7)+"\u00A0\u00A0"+(fi+14)+"\u00A0\u00A0"+(fi+21)+"\u00A0\u00A0"+ws5+"\u00A0\u00A0"+ws6;
    }
    // выводит построчно календарь
    public static String [] print(int mm,int yyyy){
        Day dpr=Day.MON;
        int st=Fst(mm,yyyy);
        dINmob=new Calendar().dInMon(mm,yyyy);
        Frst =(" "+Month.byNum(mm)+"_"+yyyy+"   (1st - "+ Day.byNum(Fst(mm,yyyy))+" & "+dINmob+" days)");
        String [] strOfhDay= new String[7];
        for (int i=1; i<=7; i++){
            strOfhDay[i-1]= String.format(calendStr(dpr,7-st+i));
            dpr=Day.byNum(1+i);
        }
        return strOfhDay;
    }

    // определяет на кокой день приходится первое число
    public static int Fst(int mm, int yyyy) {
        int mon=0;
        int year=0;
        int day=1;
        //       https://ru.wikibooks.org/wiki/Реализации алгоритмов/Вечный календарь
        if (mm==1 || mm==2) {
            year=yyyy-1;
            mon=mm+10;
        }
        else {mon=mm-2;
            year=yyyy; }
        day=(1+(31*mon)/12+year+year/4-year/100+year/400)%7 ;
        if (day==0) day=7;
        return day;
    }


}