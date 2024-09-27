package thi.nguyenhoanganh.bai1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       //Hàm này được gọi đầu tiên trước khi app hiện ra
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Gắn với giao diện
        //---------------------------------------------------------------
        //Tìm điều khiển để tham chiếu đến và thao tác
        EditText dieuKhienA = findViewById(R.id.edtA);
                //Java <-----------------------> xml
        EditText dieuKhienB = findViewById(R.id.edtB);

        Button nutTinhToan = findViewById(R.id.btnTong);
        //---------------------------------------------------------------
        //2. Qui định hàm sẽ được gọi khi người dùng nhấn vào nút tinh toán
            //2.1 Trở ra file xml, tìm thuộc tính OnClick
            // của nút bấm, đặt cho một tên (tên hàm)
            // ví dụ: OnClick: XuLyTinhTong
        //2.2 Ra khỏi hàm OnCreate này để viết hàm XuLyTinhTong

    } // Hết hàm OnCreat

    //Ta viết hàm xử lý tính tổng ở đây
    public void XuLyTinhTong(View v){
        //1.Tìm điều khiển cần thao tác nếu chưa tìm
        EditText dieuKhienA = findViewById(R.id.edtA);
        EditText dieuKhienB = findViewById(R.id.edtB);
        TextView tvKetQua = findViewById(R.id.tvKetQua);
        //2.Lấy dữ liệu
        String strSoThuNhat =dieuKhienA.getText().toString();
                                //phải đưa về String, vì ghetText() cho ta 1 Object
        String strSoThuHai = dieuKhienB.getText().toString();
        //3.Đưa về kiểu dữ liệu phù hợp (ở đây là dữ liệu số) để tính toán
        double soA = Double.parseDouble(strSoThuNhat);
        double soB = Double.parseDouble(strSoThuHai);
        //4.Tính toán
        double ketQua = soA + soB;
        //Xuất kết quả ra dieu khiển tương ứng
            //Chuẩn bị: Đưa sang dạng chuỗi
            String chuoiThongBao = String.valueOf(ketQua);
        //để settext
        tvKetQua.setText(chuoiThongBao);


    }


}