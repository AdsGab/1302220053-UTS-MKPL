package lib;

public abstract class Paygrade {
    /**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
    public abstract int calculateSalary(boolean isForeigner);
}

class Grade1 extends Paygrade{

    @Override
    public int calculateSalary(boolean isForeigner) {
        int monthlySalary = 3000000;
        if (isForeigner) {
            monthlySalary = (int) (3000000 * 1.5);
        }
        return monthlySalary;
    }
    
}


class Grade2 extends Paygrade{

    @Override
    public int calculateSalary(boolean isForeigner) {
        int monthlySalary = 5000000;
        if (isForeigner) {
            monthlySalary = (int) (5000000 * 1.5);
        }
        return monthlySalary;
    }
    
}

class Grade3 extends Paygrade{

    @Override
    public int calculateSalary(boolean isForeigner) {
        int monthlySalary = 7000000;
        if (isForeigner) {
            monthlySalary = (int) (7000000 * 1.5);
        }
        return monthlySalary;
    }
    
}