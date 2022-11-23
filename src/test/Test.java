package test;

import business.object.BackEndDeveloper;
import business.object.DataAnalyst;
import business.object.SquadLeader;
import calendar.PrintCalendar;
import enums.Shift;
import requests.analysis.RequestAnalysis;
import requests.types.AnnualLeave;

import menu.Initialize;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        //Inicializando menu de opções
        Initialize menu = new Initialize();
        menu.initialize();


        //Instanciando funcionários
        SquadLeader neire = new SquadLeader(
                "Neire",
                Shift.SECOND,
                LocalDate.of(2020, 03, 10)
        );

        BackEndDeveloper sara = new BackEndDeveloper(
                "Sara",
                Shift.SECOND,
                LocalDate.of(2021, 02, 02)
        );

        BackEndDeveloper marli = new BackEndDeveloper(
                "Marli",
                Shift.SECOND,
                LocalDate.of(2021, 03, 02)
        );

        DataAnalyst viviani = new DataAnalyst(
                "Viviani",
                Shift.THIRD,
                LocalDate.of(2022, 04, 02)
        );


//
//        PrintCalendar printCalendar = new PrintCalendar();
//        printCalendar.calendar(LocalDate.now());

        //Instanciando requisição de férias de duas funcionárias
        //que atuam na mesma função e mesmo turno com período de férias que se sobrepõem
        AnnualLeave saraRequest = new AnnualLeave(
                LocalDate.of(2023, 01, 15),
                LocalDate.of(2023, 02, 01),
                sara
        );

        AnnualLeave marliRequest = new AnnualLeave(
                LocalDate.of(2023, 01, 25),
                LocalDate.of(2023, 02, 25),
                marli
        );

        List<AnnualLeave> list1 = new ArrayList<>();
        list1.add(saraRequest);
        list1.add(marliRequest);

        //Printando objetos de Annual leave
            for(AnnualLeave obj: list1)
                System.out.println(obj);

        //Testando se as requisições de férias serão aprovadas ou não
        RequestAnalysis requestAnalysis = new RequestAnalysis();
        requestAnalysis.isApproved(saraRequest, marliRequest);
    }
}
