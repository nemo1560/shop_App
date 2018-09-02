package com.example.nemo1.shop_app.shop_core.data;

import com.example.nemo1.shop_app.R;
import com.example.nemo1.shop_app.shop_core.entity.eMusic;

import java.util.ArrayList;
import java.util.List;

public class mMusic {
    private List<eMusic> eMusicList;

    public List<eMusic> geteMusicList() {
        eMusicList = new ArrayList<>();

        eMusic eMusic1 = new eMusic("Chuyện của mặt trời", R.mipmap.ha_tran,"Hà Trần");
        eMusic eMusic2 = new eMusic("Em gái mưa", R.mipmap.huong_tram,"Hương Tràm");
        eMusic eMusic3 = new eMusic("Nguyên Vũ Collection", R.mipmap.nguyen_vu,"Nguyên Vũ");
        eMusic eMusic4 = new eMusic("Như phút ban đầu", R.mipmap.noo_phuoc_thinh,"Noo Phước Thịnh");
        eMusic eMusic5 = new eMusic("Remix Spacial", R.mipmap.re_mix,"Remix");
        eMusic eMusic6 = new eMusic("Tình về nơi đâu", R.mipmap.tinh_ve_noi_dau,"Thanh Bùi");
        eMusic eMusic7 = new eMusic("Anh sẽ quay về", R.mipmap.the_men,"The Men");
        eMusic eMusic8 = new eMusic("Ngưởi tình trăm năm", R.mipmap.paris_by_night,"Hải ngoại");
        eMusic eMusic9 = new eMusic("Một thời đã xa", R.mipmap.phuong_thanh,"Phương Thanh");
        eMusic eMusic10 = new eMusic("Vệ sĩ bất đắc dĩ", R.mipmap.ung_hoang_phuc,"Ưng Hoàng Phúc");

        eMusicList.add(eMusic1);
        eMusicList.add(eMusic2);
        eMusicList.add(eMusic3);
        eMusicList.add(eMusic4);
        eMusicList.add(eMusic5);
        eMusicList.add(eMusic6);
        eMusicList.add(eMusic7);
        eMusicList.add(eMusic8);
        eMusicList.add(eMusic9);
        eMusicList.add(eMusic10);

        return eMusicList;
    }
}
