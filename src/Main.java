public class Main {
    public static void main(String[] args) {
        System.out.println("Привет");
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var BoxerWeight1 = 78.2;
        var BoxerWeight2 = 82.7;

        var TotalWeightBoxer = BoxerWeight2 + BoxerWeight1;
        System.out.println("общий вес двухбойцов " + TotalWeightBoxer + " кг");

        var DifferenceWeightBoxer = BoxerWeight2 - BoxerWeight1;
        System.out.println("разница в весе бойцов " + DifferenceWeightBoxer + " кг");

        System.out.println("разница в весе бойцов " + DifferenceWeightBoxer + " кг");
        var TotalHours = 640;
        var WorkingTime = 8;
        var TotalEmployeesInTheCompany = TotalHours / WorkingTime;
        System.out.println("Всего работников в компании " + TotalEmployeesInTheCompany + " человек");
        TotalEmployeesInTheCompany = TotalEmployeesInTheCompany + 94;
        System.out.println("Всего работников в компании после увеличения " + TotalEmployeesInTheCompany+ " человка");
        var HoursToDivideAfterStaffIncreas = TotalEmployeesInTheCompany * WorkingTime- TotalHours ;
        System.out.println("Если в компании работает " + TotalEmployeesInTheCompany + " человека"+ " то всего "+ HoursToDivideAfterStaffIncreas + " часа работы может быть поделено между сотрудниками.");

        byte bananas = 100;
        System.out.println("Бананао " + bananas+ "кг" );
        short apples = 200;
        System.out.println("яблок " + apples+ "кг" );
        float potato = 5;
        float onePoint = potato/6;
        System.out.println("одна порция картофеля весит " + onePoint+ "кг" );
        float sugar = 5;
        float oneBag = sugar /6;
        System.out.println(" мешок сахара " + oneBag + "кг" );
        double tomato = 7;
        double oneBox = tomato / 8;
        System.out.println(" одна коробка помидор " + oneBox  + "кг" );

        double a = 27.12;
        System.out.println(a);
        long x = 987678965549L;
        System.out.println(x);
        byte c = 2;
        System.out.println(c);
        short b = 786;
        System.out.println(b);
        boolean k = false;
        System.out.println(k);

        short d = 569;
        System.out.println(d);
        int v = -159;
        System.out.println(v);
        short n = 27897;
        System.out.println(n);
        byte m = 67;
        System.out.println(m);
        byte Ludmila = 23;
        short Ann = 27;
        int Ekaterina = 30;
        int pupils = Ludmila + Ann + Ekaterina;
        System.out.println("всего "  + pupils + " учеников ");
        short totalPaper = 480;
        int sheetsForOneStudent = totalPaper/pupils;
        System.out.println("На каждого ученика рассчитано " + sheetsForOneStudent + " листов бумаги" );


        byte machinePerformanceOneMinute = 16/2;
        System.out.println("произодителность машины " + machinePerformanceOneMinute + " бутылок за 1 минуту " );
        byte min20 = 20;
        int in20minutes = machinePerformanceOneMinute * min20;
        System.out.println("За " + min20 + " минут машина произвела " + in20minutes + " бутылок ");
        byte hourMinutes = 60;
        byte hourInDay =24;

        int minutesInDay = hourMinutes*hourInDay;
        System.out.println( " в сутках " + minutesInDay+ " минут" );

        int perDay = minutesInDay * machinePerformanceOneMinute;
        System.out.println("За " + minutesInDay + " минуты машина произвела " + perDay + " бутылок ");
        int minutesIn3Day = minutesInDay*hourInDay;
        int Days3 = perDay*3;
        System.out.println("За  " + minutesInDay*hourInDay + " минуты машина произвела " + Days3 + " бутылок ");

        byte DaysInMonth = 30;
        int minutesInMonth = minutesInDay * DaysInMonth;
        int month = minutesInDay * DaysInMonth;
        System.out.println("За  " + minutesInMonth + " минут машина произвела " + month + " бутылок ");


        int totalCans = 120;
        short whiteCans = 2;
        byte brownCans = 4;

        int canPerClass = whiteCans+brownCans;
        System.out.println("Общее количество " + canPerClass +  " банок на один класс");
        int totalClasses = totalCans/canPerClass;
        System.out.println("Общее количество " + totalClasses +  " классов");

        int totalWhiteCans = totalClasses*whiteCans;
        int totalBrownCans = totalClasses*brownCans;
        System.out.println("В школе, где "  + totalClasses + " классов " +  ", нужно " +totalWhiteCans+ " банок белой краски " + " и " + totalBrownCans + " банок коричневой краски ."  );

        byte banana = 80;
        int totalWeightBananas =  banana*5;
        System.out.println("общий вес бананов " + totalWeightBananas + " грамм");

        short milk = 105;
        int totalWeightMilk = milk*2;
        System.out.println("общийвес молока " +totalWeightMilk+ "грамм");

        byte iceCream = 100;
        int totalWeightIceCream = iceCream*2;
        System.out.println("общий вес мроженного " +totalWeightIceCream+ " грамм");

        byte egg = 70;
        int totalWeightEgg = 70*4;
        System.out.println("общий вес яиц " +totalWeightEgg+ " грамм");

        float totalWeightProducts = (totalWeightBananas+totalWeightMilk+totalWeightIceCream+totalWeightEgg)/1000f;
        System.out.println("общий вес коктейля "+ totalWeightProducts + " килограмм");

        int losingWight250 = 7000/250;
        System.out.println("за " +losingWight250+ " дней спртсмен похудеет если будет питаться по 250 грамм в день ");
        int losingWight500 = 7000/500;
        System.out.println("за " +losingWight500+ " дней спртсмен похудеет если будет питаться по 250 грамм в день ");








    }
}