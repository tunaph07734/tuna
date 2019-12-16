
package assht;

import java.util.Scanner;


public class tunaph07734_mob1013_assignment {

    
    public static Scanner sc = new Scanner(System.in);
    static String hoTen[]=new String [50];
    static double diem[]=new double[50];
    static String email[]=new String[50];
    static int size;
    static double trungBinh =0;
    static String hocLuc = null;
    public static void main(String[] args) {
        while(true){
            menu();
        }
    }
    static void menu(){
        System.out.println("--------------------------");
        System.out.println("1.Nhập danh sách học viên.");
        System.out.println("2.Xuất danh sách học viên.");
        System.out.println("3.Tìm kiếm học viên theo khoảng điểm.");
        System.out.println("4.Tìm kiếm học viên theo học lực.");
        System.out.println("5.Tìm học viên theo mã số và cập nhật thông tin học viên");
        System.out.println("6.Sắp xếp học viên theo điểm");
        System.out.println("7.Xuất 5 học viên có điểm cao nhất");
        System.out.println("8.Tính điểm trung bình của lớp.");
        System.out.println("9.Xuất danh sách học viên có điểm trên điểm trung bình của lớp");
        System.out.println("10.Tổng hợp số học viên theo học lực.");
        System.out.println("11.Thoát.");
        System.out.println("--------------------------");
        System.out.print("Mời bạn chọn chức năng : ");
       int cacChucNang = Integer.parseInt(sc.nextLine());
        switch(cacChucNang){
            case 1:
                System.out.println("Mời chọn nhập danh sách học viên. ");
                nhapDanhSachHocVien();
                break;
            case 2:
                System.out.println("Mời xuất danh sách học viên. ");
                xuatDanhSachHocVien();
                break;
            case 3:
                System.out.println("Mời tìm kiếm học viên theo khoảng điểm. ");
                timKiemHocVienTheoKhoangDiem();
                break;
            case 4:
                System.out.println("Mời Tìm kiếm học viên theo học lực. ");
                timKiemHocvienTheohocLuc();
                break;
            case 5:
                System.out.println("Mời tìm kiếm học viên theo mã số và cập nhật thông tin học viên. ");
                timKiemThongTinHocVienVaCapNhatThongTinHocVien();
                break;
            case 6:
                System.out.println("Mời Sắp xếp học viên theo điểm. ");
                sapXepHocVienTheoDiem();
                break;
            case 7:
                System.out.println("Mời xuất 5 học viên có điểm cao nhất. ");
                xuat5HocVienCosDiemCaoNhat();
                break;
            case 8:
                System.out.println("Mời tính điểm trung bình cả lớp. ");
                tinhDiemTrungBinhCalop();
                break;
            case 9:
                System.out.println("Mời xuất danh sách học viên có điểm trên trung bình. ");
                danhSachSoHocVienCoDiemTrenTrungBinh();
                break;
            case 10:
                System.out.println("Mời tổng hợp số học viên theo lớp học. ");
                tongSoHocVienTheoHocLuc();
                break;
            case 11:
                System.exit(0);
               break;
              default: System.out.println("Bạn chỉ được chọn các chức năng có ở trên thôi nhé!");
                  break;
        }
        
    }
    static void nhapDanhSachHocVien(){
        System.out.print("Nhập số học viên: ");
        size = Integer.parseInt(sc.nextLine());
        for(int i=0;i<size;i++){
            System.out.printf("%d. ",i+1);
            System.out.print("Nhập họ tên : ");
            hoTen[i]=sc.nextLine();
            System.out.print("Nhập điểm : ");
            diem[i]=Double.parseDouble(sc.nextLine());
            System.out.print("Nhập email : ");
            email[i]=sc.nextLine();
            System.out.println(" ");
        }
    }
    static void xuatDanhSachHocVien(){
        System.out.println("------------------------");
        for(int i=0;i<size;i++){
            System.out.printf("%d. ",i+1);
            System.out.println("Họ tên : "+hoTen[i]);
            System.out.println("Điểm : "+diem[i]);
            System.out.println("Email : "+email[i]);
        if(diem[i]<5)
            hocLuc = "Yếu";
        else if(diem[i]>=5 && diem[i]<6.5)
            hocLuc = "Trung Bình";
       else if(diem[i]>=6.5 && diem[i]<7.5)
            hocLuc = "Khá";
        else if(diem[i]>=7.5 && diem[i]<9)
            hocLuc = "Giỏi";
        else if(diem[i]>=9)
            hocLuc = "Xuất xắc";
            System.out.println("Học lực " +hocLuc);
            System.out.println(" ");
        }
    }
    static void timKiemHocVienTheoKhoangDiem(){
        System.out.print("Nhập điểm min : ");
        double min = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập điểm max : ");
        double max= Double.parseDouble(sc.nextLine());
        for(int i=0;i<size;i++){
            if(diem[i]>= min && diem[i]<= max){
                System.out.println("Họ tên: "+hoTen[i]);
                System.out.println("Điểm: "+diem[i]);
                System.out.println("Email: "+email[i]);
            }
        }
    }
    static void timKiemHocvienTheohocLuc(){
        System.out.print("Mời nhập học lực : ");
        String hl = sc.nextLine();
       for(int i=0;i<size;i++){
           if(hl.equalsIgnoreCase("Yeu")&& diem[i]<5){
               System.out.println("Họ tên : "+hoTen[i]);
               System.out.println("Điểm : "+diem[i]);
               System.out.println("Email : "+email[i]);
           }else if(hl.equalsIgnoreCase("TrungBinh")&& diem[i]>=5 && diem[i]<6.5){
               System.out.println("Họ tên : "+hoTen[i]);
               System.out.println("Điểm : "+diem[i]);
               System.out.println("Email : "+email[i]); 
           }else if(hl.equalsIgnoreCase("Kha")&&diem[i]>=6.5 && diem[i]<7.5){
               System.out.println("Họ tên : "+hoTen[i]);
               System.out.println("Điểm : "+diem[i]);
               System.out.println("Email : "+email[i]); 
           }else if(hl.equalsIgnoreCase("Gioi")&& diem[i]>=7.5 && diem[i]<9){
               System.out.println("Họ tên : "+hoTen[i]);
               System.out.println("Điểm : "+diem[i]);
               System.out.println("Email : "+email[i]); 
           }else if(hl.equalsIgnoreCase("Xuatxac")&&diem[i]>=9){
               System.out.println("Họ tên : "+hoTen[i]);
               System.out.println("Điểm : "+diem[i]);
               System.out.println("Email : "+email[i]);
           }
       }
        
    }
    static void timKiemThongTinHocVienVaCapNhatThongTinHocVien(){
        
    }
    static void sapXepHocVienTheoDiem(){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(diem[i]<diem[j]){
                    double temp=diem[i];
                    diem[i]=diem[j];
                    diem[j]=temp;
                    String temp1=hoTen[i];
                    hoTen[i]=hoTen[j];
                    hoTen[j]=temp1;
                    String temp2=email[i];
                    email[i]=email[j];
                    email[j]=temp2;
                }
            }
        }
        System.out.println("Điểm sắp xếp giảm dần là:");
        for(int i=0;i<size;i++){
            System.out.println("Họ tên là : "+hoTen[i]);
            System.out.println("Điểm : "+diem[i]);
            System.out.println("Email : "+email[i]);
        }
    }
    static void xuat5HocVienCosDiemCaoNhat(){
        for(int i=0;i<5;i++){
            System.out.printf("%d. : ",i+1);
            System.out.println("Họ tên là : "+hoTen[i]);
            System.out.println("Điểm : "+diem[i]);
            System.out.println("Email : "+email[i]);
        }
   
    }
    static void tinhDiemTrungBinhCalop(){
        double tong =0;
        for(int i=0;i<size;i++){
            tong+=diem[i];
        } 
        trungBinh=tong/size;
        System.out.println("Điểm trung bình cả lớp là: "+trungBinh);

    }
    static void danhSachSoHocVienCoDiemTrenTrungBinh(){
        System.out.println("Danh sách học viên có điểm trên trung bình là: ");
        for(int i=0;i<size;i++){
            
            if(diem[i]>trungBinh){
                System.out.printf("%d. ",i+1);
                System.out.println("Họ tên: "+hoTen[i]);
                System.out.println("Điểm: "+diem[i]);
                System.out.println("Email: "+email[i]);
            }
            System.out.println("  ");
    }
    }
    static void tongSoHocVienTheoHocLuc(){
        System.out.println("------------------------");
        System.out.println("Học Lực Yếu");
        for(int i=0;i<size;i++){
            if(diem[i]<5){
              System.out.println("Họ tên là : "+hoTen[i]);
               System.out.println("Điểm là : "+diem[i]);
               System.out.println("Email là : "+email[i]);  
            } 
        }System.out.println("===================");
        System.out.println("Học Lực Trung bình");
        for(int i=0;i<size;i++){
            if(diem[i]>=5 && diem[i]<6.5){
                System.out.println("Họ tên là : "+hoTen[i]);
               System.out.println("Điểm là : "+diem[i]);
               System.out.println("Email là : "+email[i]);   
            }
        }System.out.println("===================");
        System.out.println("Học Lực Khá");
        for(int i=0;i<size;i++){
            if(diem[i]>=6.5&& diem[i]<7.5){
               System.out.println("Họ tên là : "+hoTen[i]);
               System.out.println("Điểm là : "+diem[i]);
               System.out.println("Email là : "+email[i]);  
            }
        }System.out.println("===================");
        System.out.println("Học Lực Giỏi");
        for(int i=0;i<size;i++){
            if(diem[i]>=7.5 && diem[i]<9){
               System.out.println("Họ tên là : "+hoTen[i]);
               System.out.println("Điểm là : "+diem[i]);
               System.out.println("Email là : "+email[i]);  
            }
        }System.out.println("===================");
        System.out.println("Học lực xuất xắc");
        for(int i=0;i<size;i++){
            if(diem[i]>=9){
                System.out.println("Họ tên là : "+hoTen[i]);
               System.out.println("Điểm là : "+diem[i]);
               System.out.println("Email là : "+email[i]);
            }
        }
    }
}

