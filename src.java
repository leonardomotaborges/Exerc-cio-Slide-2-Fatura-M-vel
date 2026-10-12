import java.util.Scanner;

final double EXTRA_PER_MINUTE_CALLS = 0.35;
final int EXTRA_PER_GB_CELDATA = 5;
final int BASE_PACK_PRICE = 20;
final double IVA = 1.23;
final int MINUTES_BASE_PACK = 120;
final int CELDATA_BASE_PACK = 20;

void basePack (int minutes,int celdata){
    if (minutes <= 120 && celdata <= 20)
        System.out.println(BASE_PACK_PRICE*IVA);
    else {
    }

    extras(minutes,celdata);
}

double extras (int minutes,int celdata) {

    int extraMinutes = 0;
    int extraCeldata = 0;

    if (minutes > 120) {
        extraMinutes = minutes - MINUTES_BASE_PACK;
    }
    if (celdata > 120) {
        extraCeldata = celdata - CELDATA_BASE_PACK;
    }

    return finalPrice(extraMinutes, extraCeldata);
}

void finalPrice (double extraMinutes,double extraCeldata){
    extraMinutes = EXTRA_PER_MINUTE_CALLS*extraMinutes;
    extraCeldata = EXTRA_PER_GB_CELDATA*extraCeldata;

    double extrasPrice = extraMinutes+extraCeldata;
    double payment = (20+extrasPrice)*IVA;
    System.out.println(payment);
}

void inputs (){
    Scanner in = new Scanner (System.in);
    System.out.println("Introduza os minutos de chamadas do mês");
    int minutes = in.nextInt();
    System.out.println("Introduza os Gb de dados móveis do mês");
    int celdata = in.nextInt();

    basePack(minutes, celdata);

    in.close();
}

void main(){
    System.out.println("Calculador da Mensalidade do mês (em Euros)");
    inputs();
}
