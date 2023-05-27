import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String name1 = "MFTI";
        int students1 = 7500;
        int teachers1 = 3400;
        double rating1 = 290;
        University MFTI = new University(name1, students1, teachers1, rating1);

        String name2 = "MSU";
        int students2 = 38150;
        int teachers2 = 10784;
        double rating2 = 250;
        University MSU = new University(name2, students2, teachers2, rating2);

        String name3 = "DVGUPS";
        int students3 = 13000;
        int teachers3 = 350;
        double rating3 = 178;
        University DVGUPS = new University(name3, students3, teachers3, rating3);

        String name4 = "SPBSU";
        int students4 = 20000;
        int teachers4 = 5000;
        double rating4 = 265;
        University SPBSU = new University(name4, students4, teachers4, rating4);

        String name5 = "HSE";
        int students5 = 47500;
        int teachers5 = 7000;
        double rating5 = 285.3;
        University HSE = new University(name5, students5, teachers5, rating5);

        String name6 = "MGIMO";
        int students6 = 9000;
        int teachers6 = 1200;
        double rating6 = 288.6;
        University MGIMO = new University(name6, students6, teachers6, rating6);

        String name7 = "RUT";
        int students7 = 32000;
        int teachers7 = 2508;
        double rating7 = 180;
        University RUT = new University(name7, students7, teachers7, rating7);

        Set<University> humanitiesUniversity = new HashSet<University>();
        humanitiesUniversity.add(HSE);
        humanitiesUniversity.add(MGIMO);
        humanitiesUniversity.add(MSU);
        humanitiesUniversity.add(SPBSU);

        Set<University> technicalUniversity = new HashSet<University>();
        technicalUniversity.add(RUT);
        technicalUniversity.add(MFTI);
        technicalUniversity.add(MSU);
        technicalUniversity.add(DVGUPS);
        technicalUniversity.add(SPBSU);

        Set<University> allUniversity = new HashSet<University>();
        allUniversity.addAll(humanitiesUniversity);
        allUniversity.addAll(technicalUniversity);

        Set<University> mixedUniversity = new HashSet<University>();
        for (University university : humanitiesUniversity) {
            for (University university1 : technicalUniversity) {
                if (university.equals(university1)) {
                    mixedUniversity.add(university1);
                }
            }
        }

        Set<University> specialTechnicalUniversity = new HashSet<University>();
        for (University university : humanitiesUniversity) {
            for (University university1 : technicalUniversity) {
                if (!university.equals(university1)) {
                    specialTechnicalUniversity.add(university1);
                }
            }
        }

        Set<University> specialHumanitiesUniversity = new HashSet<University>();
        for (University university : humanitiesUniversity) {
            for (University university1 : technicalUniversity) {
                if (!university.equals(university1)) {
                    specialHumanitiesUniversity.add(university);
                }
            }
        }

        int set_student1 = 0;
        int set_student2 = 0;
        int set_student3 = 0;
        int set_student4 = 0;
        int set_student5 = 0;
        int set_student6 = 0;
        int k1 = 0;
        int k2 = 0;
        int k3 = 0;
        int k4 = 0;
        int k5 = 0;
        int k6 = 0;
        int set_teachers1 = 0;
        int set_teachers2 = 0;
        int set_teachers3 = 0;
        int set_teachers4 = 0;
        int set_teachers5 = 0;
        int set_teachers6 = 0;
        double set_rating1 = 0;
        double set_rating2 = 0;
        double set_rating3 = 0;
        double set_rating4 = 0;
        double set_rating5 = 0;
        double set_rating6 = 0;

        System.out.println("humanitiesUniversity: ");
        for (University university : humanitiesUniversity) {
            set_student1 += university.getStudents();
            set_teachers1 += university.getTeachers();
            set_rating1 += university.getRating();
            k1 ++;
            System.out.println(university.toString());
        }
        System.out.println("All students: " + set_student1);
        System.out.println("Average teachers: " + set_teachers1 / k1);
        System.out.println("Average rating: " + set_rating1 / k1);

        System.out.println("technicalUniversity: ");
        for (University university : technicalUniversity) {
            set_student2 += university.getStudents();
            set_teachers2 += university.getTeachers();
            set_rating2 += university.getRating();
            k2 ++;
            System.out.println(university.toString());
        }
        System.out.println("All students: " + set_student2);
        System.out.println("Average teachers: " + set_teachers2 / k2);
        System.out.println("Average rating: " + set_rating2 / k2);

        System.out.println("allUniversity: ");
        for (University university : allUniversity) {
            set_student3 += university.getStudents();
            set_teachers3 += university.getTeachers();
            set_rating3 += university.getRating();
            k3 ++;
            System.out.println(university.toString());
        }
        System.out.println("All students: " + set_student3);
        System.out.println("Average teachers: " + set_teachers3 / k3);
        System.out.println("Average rating: " + set_rating3 / k3);

        System.out.println("mixedUniversity: ");
        for (University university : mixedUniversity) {
            set_student4 += university.getStudents();
            set_teachers4 += university.getTeachers();
            set_rating4 += university.getRating();
            k4 ++;
            System.out.println(university.toString());
        }
        System.out.println("All students: " + set_student4);
        System.out.println("Average teachers: " + set_teachers4 / k4);
        System.out.println("Average rating: " + set_rating4 / k4);

        System.out.println("specialTechnicalUniversity: ");
        for (University university : specialTechnicalUniversity) {
            set_student5 += university.getStudents();
            set_teachers5 += university.getTeachers();
            set_rating5 += university.getRating();
            k5 ++;
            System.out.println(university.toString());
        }
        System.out.println("All students: " + set_student5);
        System.out.println("Average teachers: " + set_teachers5 / k5);
        System.out.println("Average rating: " + set_rating5 / k5);

        System.out.println("specialHumanitiesUniversity: ");
        for (University university : specialHumanitiesUniversity) {
            set_student6 += university.getStudents();
            set_teachers6 += university.getTeachers();
            set_rating6 += university.getRating();
            k6 ++;
            System.out.println(university.toString());
        }
        System.out.println("All students: " + set_student6);
        System.out.println("Average teachers: " + set_teachers6 / k6);
        System.out.println("Average rating: " + set_rating6 / k6);

        City Moscow = new City("Moscow", 15000000);
        City Khabarovsk = new City("Khabarovsk",  617000);
        City Dolgoprudny = new City("Dolgoprudny", 121000);
        City SPB = new City("SPB", 5400000);


        HashMap<University, City> map = new HashMap<University, City>();
        map.put(RUT, Moscow);
        map.put(SPBSU, SPB);
        map.put(MSU, Moscow);
        map.put(HSE, Moscow);
        map.put(MFTI, Dolgoprudny);
        map.put(DVGUPS, Khabarovsk);

        for (University university : map.keySet()) {
            City city = map.get(university);
            System.out.println("Population/1 student for: " + city.getName() + " / " + university.getName() + " = " + city.getPeople()/ university.getStudents());
        }
    }
}
