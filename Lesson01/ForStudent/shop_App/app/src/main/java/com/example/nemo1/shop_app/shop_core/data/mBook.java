package com.example.nemo1.shop_app.shop_core.data;

import com.example.nemo1.shop_app.R;
import com.example.nemo1.shop_app.shop_core.entity.eBook;

import java.util.ArrayList;
import java.util.List;

public class mBook {
    private List<eBook> eBookList;

    public List<eBook> geteBookList() {
        eBookList = new ArrayList<>();

        eBook eBook1 = new eBook(R.mipmap.alfred_kropp,"Alfred Kropp: The Seal of Solomon","Things have just settled down for Alfred, when he's suddenly kidnapped and forced to face a terrible threat--the Seal of Solomon.");
        eBook eBook2 = new eBook(R.mipmap.cam_thuong,"Trạm dừng mang tên hạnh phúc","\"Người ta bảo lần thứ nhất là tình cờ, lần thứ hai là tất nhiên, lần thứ ba là định mệnh.\" Ba lần gặp gỡ, cả đời bên nhau ..");
        eBook eBook3 = new eBook(R.mipmap.co_gai_mat_tich,"Cô gái mất tích 1000 Ngày Sự trở về Kỳ lạ Màu Nhiệm","Cuốn truyện ngắn như 1 cuốn nhật ký kể lại toàn bộ quá trình mất tích dài 1000 ngày của 1 cô gái có số phận kì lạ.");
        eBook eBook4 = new eBook(R.mipmap.crazy_kid,"Crazy Rich Asians","Crazy Rich Asians is the outrageously funny debut novel about three super-rich, pedigreed Chinese families and the gossip, backbiting, and scheming that occurs when the heir to one of the most massive fortunes in Asia brings home his ABC (American-born Chinese) girlfriend to the wedding of the season.");
        eBook eBook5 = new eBook(R.mipmap.duong_cam_lanh,"Dương Cầm Lạnh","Viết lại câu chuyện thanh xuân của mình, cho cậu. Viết cho những khờ dại tuổi học trò");
        eBook eBook6 = new eBook(R.mipmap.phat_giao,"GIÁO KHOA PHẬT HỌC","GIÁO KHOA PHẬT HỌC \n" +
                "\n" +
                "Cấp Một \n" +
                "\n" +
                "(Sơ Cấp Phật Học Giáo Bản – nguyên tác Hán ngữ của cư sĩ Phương Luân, Đài-loan) ");
        eBook eBook7 = new eBook(R.mipmap.warframe,"Warframe","The official comic continues! ");
        eBook eBook8 = new eBook(R.mipmap.sherlock_holmes,"The adventures of Sherlock Holmes","Sir Arthur Conan Doyle authored this collection of short stories, which makes for a perfect modern detective novel. ");
        eBook eBook9 = new eBook(R.mipmap.viet_nam,"Viet Nam: Tradition and Change","During his twenty-year tenure as a columnist for Việt Nam News, Hà Nội's English-language newspaper, ");
        eBook eBook10 = new eBook(R.mipmap.batman,"Batman: The Killing Joke","Presented for the first time with stark, stunning new coloring by Brian Bolland, BATMAN: THE KILLING JOKE is Alan Moore's unforgettable meditation on the razor-thin line between sanity and insanity, heroism and villainy, comedy and tragedy.");
        eBook eBook11 = new eBook(R.mipmap.wave,"The 5th Wave","After the 1st wave, only darkness remains. After the 2nd, only the lucky escape. And after the 3rd, only the unlucky survive. After the 4th wave, only one rule applies: trust no one.");

        eBookList.add(eBook1);
        eBookList.add(eBook2);
        eBookList.add(eBook3);
        eBookList.add(eBook4);
        eBookList.add(eBook5);
        eBookList.add(eBook6);
        eBookList.add(eBook7);
        eBookList.add(eBook8);
        eBookList.add(eBook9);
        eBookList.add(eBook10);
        eBookList.add(eBook11);

        return eBookList;
    }
}
