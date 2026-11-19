package com.example.day1103_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewFlipper Flipper;
    TextView Cost, Cart1, Cart1_1, Cart2, Cart2_1, Cart3, Cart3_1, Cart4, Cart4_1, Cart5, Cart5_1, Cost1, Cost2, Cost3, Cost4, Cost5,
            Count1, Count2, Count3, Count4, Count5, WillPay, Receipt, willPay, havePoint, canPoint;
    LinearLayout Lay2, Lay3, Lay4, Lay5;
    RadioGroup RgTemp, RgSize, RgDensity, RgIce;
    RadioButton Americano, CafeLatte, Cappuccino, CafeMocha, Hot, Iced, Medium, Large, Venti, Commonly, Lightly,
    Little, CommonlyIce, Much;
    ImageView ImgCoffee;
    CheckBox Whipping, Syrup, Shot;
    android.widget.Button Pre1, PerOption, Pre2, Cart, Minus1, Minus2, Minus3, Minus4, Minus5, Plus1, Plus2, Plus3, Plus4, Plus5, Remove1, Remove2,
            Remove3, Remove4, Remove5, More, Next, Pre3, NoPoint, Del, Ok, DEl, oK, Pre4, NoUse, Pre5, YesReceipt, NoReceipt, OkReceipt, Take;
    android.widget.Button []numButton = new android.widget.Button[10];
    android.widget.Button []pointButton = new android.widget.Button[10];
    Button In, Out, Cash, Card, Voucher;
    EditText Tel, usePoint;
    Integer []numbtnId = {R.id.num0, R.id.num1, R.id.num2, R.id.num3, R.id.num4, R.id.num5, R.id.num6, R.id.num7, R.id.num8, R.id.num9};
    Integer []pointbtnId = {R.id.pin0, R.id.pin1, R.id.pin2, R.id.pin3, R.id.pin4, R.id.pin5, R.id.pin6, R.id.pin7, R.id.pin8, R.id.pin9};
    int cost, i, point, n, IntPoint, howPoint, POINT, willpay, NewPOINT, count=1, count1=1, count2=1, count3=1, count4=1, count5=1,
            cost1=0, cost2=0, cost3=0, cost4=0, cost5=0, totalCost;
    String tel, option1, option2, option3, option4, option5, coffee, temp, size, density,
            ice, whipping, syrup, shot, coffee1="", coffee2="", coffee3="", coffee4="", coffee5="", TEL, pay, where, Point;
    boolean found;
    ArrayList<String> phones = new ArrayList<>();
    ArrayList<Integer> points = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Flipper = findViewById(R.id.Flipper);
        Cost = findViewById(R.id.Cost); Cart1 = findViewById(R.id.Cart1); Cart2 = findViewById(R.id.Cart2); Cart3 = findViewById(R.id.Cart3);
        Cart4 = findViewById(R.id.Cart4); Cart5 = findViewById(R.id.Cart5); Cost1  = findViewById(R.id.Cost1); Cost2 = findViewById(R.id.Cost2);
        Cost3 = findViewById(R.id.Cost3); Cost4 = findViewById(R.id.Cost4); Cost5 = findViewById(R.id.Cost5); Count1 = findViewById(R.id.Count1);
        Count2 = findViewById(R.id.Count2); Count3 = findViewById(R.id.Count3); Count4 = findViewById(R.id.Count4); Count5 = findViewById(R.id.Count5);
        Cart1_1 = findViewById(R.id.Cart1_1); Cart2_1 = findViewById(R.id.Cart2_1);Cart3_1 = findViewById(R.id.Cart3_1);
        Cart4_1 = findViewById(R.id.Cart4_1); Cart5_1 = findViewById(R.id.Cart5_1); WillPay = findViewById(R.id.WillPay);
        Lay2 = findViewById(R.id.Lay2); Lay3 = findViewById(R.id.Lay3); Lay4 = findViewById(R.id.Lay4); Lay5 = findViewById(R.id.Lay5);
        Receipt = findViewById(R.id.Receipt); willPay = findViewById(R.id.willPay);
        havePoint = findViewById(R.id.havePoint); canPoint = findViewById(R.id.canPoint);
        RgTemp = findViewById(R.id.RgTemp); RgSize = findViewById(R.id.RgSize); RgDensity = findViewById(R.id.RgDensity);
        RgIce = findViewById(R.id.RgIce);
        Whipping = findViewById(R.id.Whipping); Syrup = findViewById(R.id.Syrup); Shot = findViewById(R.id.Shot);
        Americano = findViewById(R.id.Americano); CafeLatte = findViewById(R.id.CafeLatte); Cappuccino = findViewById(R.id.Cappuccino);
        CafeMocha = findViewById(R.id.CafeMocha); Hot = findViewById(R.id.Hot); Iced = findViewById(R.id.Iced);
        Medium = findViewById(R.id.Medium); Large = findViewById(R.id.Large); Venti = findViewById(R.id.Venti);
        Commonly = findViewById(R.id.Commonly); Lightly = findViewById(R.id.Lightly); Little = findViewById(R.id.Little);
        CommonlyIce = findViewById(R.id.CommonlyIce); Much = findViewById(R.id.Much);
        ImgCoffee = findViewById(R.id.ImgCoffee);
        PerOption = findViewById(R.id.PerOption); Pre1 = findViewById(R.id.Pre1); Pre2 = findViewById(R.id.Pre2); Pre3 = findViewById(R.id.Pre3);
        Cart = findViewById(R.id.Cart); Minus1 = findViewById(R.id.Minus1); Minus2 = findViewById(R.id.Minus2); Minus3 = findViewById(R.id.Minus3);
        Minus4 = findViewById(R.id.Minus4); Minus5 = findViewById(R.id.Minus5); Plus1 = findViewById(R.id.Plus1); Plus2 = findViewById(R.id.Plus2);
        Plus3 = findViewById(R.id.Plus3); Plus4 = findViewById(R.id.Plus4); Plus5 = findViewById(R.id.Plus5); Remove1 = findViewById(R.id.Remove1);
        Remove2 = findViewById(R.id.Remove2); Remove3 = findViewById(R.id.Remove3); Remove4 = findViewById(R.id.Remove4);
        Remove5 = findViewById(R.id.Remove5); More = findViewById(R.id.More); Next = findViewById(R.id.Next); NoPoint = findViewById(R.id.NoPoint);
        Del = findViewById(R.id.Del); Ok = findViewById(R.id.Ok); YesReceipt = findViewById(R.id.YesReceipt);
        NoReceipt = findViewById(R.id.NoReceipt); OkReceipt = findViewById(R.id.OkReceipt); Take = findViewById(R.id.Take);
        Pre4 = findViewById(R.id.Pre4); NoUse = findViewById(R.id.NoUse); Pre5 = findViewById(R.id.Pre5);
        oK = findViewById(R.id.oK); DEl = findViewById(R.id.DEl);
        In = findViewById(R.id.In); Out = findViewById(R.id.Out); Cash = findViewById(R.id.Cash);
        Card = findViewById(R.id.Card); Voucher = findViewById(R.id.Voucher);
        Tel = findViewById(R.id.Tel); usePoint = findViewById(R.id.usePoint);

        for (i=0; i<numbtnId.length; i++)
            numButton[i] = findViewById(numbtnId[i]);

        for (n=0; n<pointbtnId.length; n++)
            pointButton[n] = findViewById(pointbtnId[n]);


        // 기본 ----------------------------------------------------------------------------------

        // 배경 음악
        final MediaPlayer[] mp = {new MediaPlayer()};
        mp[0] = MediaPlayer.create(getApplicationContext(), R.raw.cafemusic);
        if (mp[0] != null) {
            mp[0].setLooping(true);
            mp[0].start();
        }


        // 이용 방식 ------------------------------------------------------------------------------

        // 매장
        In.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                In.setSelected(true);
                where = "매장";
                Flipper.showNext();
            }
        });

        // 포장
        Out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Out.setSelected(true);
                where = "포장";
                Flipper.showNext();}
        });


        // 메뉴 선택 ===============================================================================================

        // 아메리카노
        Americano.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (Americano.isChecked()){
                    CafeLatte.setChecked(false);
                    Cappuccino.setChecked(false);
                    CafeMocha.setChecked(false);
                    cost += 3000;
                    Cost.setText("금액: " + cost + "원");
                    coffee = "아메리카노";
                }
                else {
                    cost -= 3000;
                    Cost.setText("금액: " + cost + "원");
                }
            }
        });

        // 카페라떼
        CafeLatte.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (CafeLatte.isChecked()){
                    Americano.setChecked(false);
                    Cappuccino.setChecked(false);
                    CafeMocha.setChecked(false);
                    cost += 3600;
                    Cost.setText("금액: " + cost + "원");
                    coffee = "카페라떼";
                }
                else {
                    cost -= 3600;
                    Cost.setText("금액: " + cost + "원");
                }
            }
        });

        // 카푸치노
        Cappuccino.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (Cappuccino.isChecked()){
                    Americano.setChecked(false);
                    CafeLatte.setChecked(false);
                    CafeMocha.setChecked(false);
                    cost += 3300;
                    Cost.setText("금액: " + cost + "원");
                    coffee = "카푸치노";
                }
                else {
                    cost -= 3300;
                    Cost.setText("금액: " + cost + "원");
                }
            }
        });

        // 카페모카
        CafeMocha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (CafeMocha.isChecked()){
                    Americano.setChecked(false);
                    CafeLatte.setChecked(false);
                    Cappuccino.setChecked(false);
                    cost += 4000;
                    Cost.setText("금액: " + cost + "원");
                    coffee = "카페모카";
                }
                else {
                    cost -= 4000;
                    Cost.setText("금액: " + cost + "원");
                }
            }
        });

        // 이전
        Pre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count > 1) {
                    Flipper.showNext();
                    Flipper.showNext();
                    Flipper.showNext();
                } else {
                    Americano.setChecked(false);
                    CafeLatte.setChecked(false);
                    Cappuccino.setChecked(false);
                    CafeMocha.setChecked(false);
                    In.setSelected(false);
                    Out.setSelected(false);
                    Flipper.showPrevious();
                }
            }
        });

        // 퍼스널 옵션 선택
        PerOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Americano.isChecked() || CafeLatte.isChecked() || Cappuccino.isChecked() || CafeMocha.isChecked()){
                    Flipper.showNext();
                    Cost.setText("금액: " + cost + "원");
                }
                else {
                    Toast.makeText(getApplicationContext(), "메뉴를 선택해 주세요.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


        // 옵션 선택 ========================================================================================================

        // 핫 선택시
        Hot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (Little.isChecked() || CommonlyIce.isChecked() || Much.isChecked()){
                    RgIce.clearCheck();
                }
            }
        });

        // 핫 선택 중 얼음 선택시 (조금)
        Little.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (Hot.isChecked()){
                    Little.setChecked(false);
                    Toast.makeText(getApplicationContext(), "핫 음료는 얼음 선택이 불가능합니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 핫 선택 중 얼음 선택시 (보통)
        CommonlyIce.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (Hot.isChecked()){
                    CommonlyIce.setChecked(false);
                    Toast.makeText(getApplicationContext(), "핫 음료는 얼음 선택이 불가능합니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 핫 선택 중 얼음 선택시 (많이)
        Much.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (Hot.isChecked()){
                    Much.setChecked(false);
                    Toast.makeText(getApplicationContext(), "핫 음료는 얼음 선택이 불가능합니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


        // 라지 선택시
        Large.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // 가격 변동
                if (Large.isChecked()){
                    cost += 400;
                    Cost.setText("금액: " + cost + "원");
                } else {
                    cost -= 400;
                    Cost.setText("금액: " + cost + "원");
                }
            }
        });

        // 벤티 선택시
        Venti.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // 가격 변동
                if (Venti.isChecked()){
                    cost += 700;
                    Cost.setText("금액: " + cost + "원");
                } else {
                    cost -= 700;
                    Cost.setText("금액: " + cost + "원");
                }
            }
        });

        // 샷 추가 선택시
        Shot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // 가격 변동
                if (Shot.isChecked()){
                    cost += 300;
                    Cost.setText("금액: " + cost + "원");
                } else {
                    cost -= 300;
                    Cost.setText("금액: " + cost + "원");
                }
            }
        });

        // 이전
        Pre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RgTemp.clearCheck();
                RgSize.clearCheck();
                RgDensity.clearCheck();
                RgIce.clearCheck();
                Whipping.setChecked(false);
                Syrup.setChecked(false);
                Shot.setChecked(false);
                Flipper.showPrevious();
            }
        });

        // 장바구니 담기
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 필수 옵션 미선택시
                if (RgTemp.getCheckedRadioButtonId() == R.id.Hot){
                    if (RgTemp.getCheckedRadioButtonId() != -1 &&
                            RgSize.getCheckedRadioButtonId() != -1 &&
                            RgDensity.getCheckedRadioButtonId() != -1){
                        Flipper.showNext();
                    } else if (RgTemp.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(getApplicationContext(), "핫/아이스를 선택해 주세요.",
                                Toast.LENGTH_SHORT).show();
                    } else if (RgSize.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(getApplicationContext(), "사이즈를 선택해 주세요.",
                                Toast.LENGTH_SHORT).show();
                    } else if (RgDensity.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(getApplicationContext(), "농도를 선택해 주세요.",
                                Toast.LENGTH_SHORT).show();
                    }
                }else {
                    if (RgTemp.getCheckedRadioButtonId() != -1 &&
                            RgSize.getCheckedRadioButtonId() != -1 &&
                            RgDensity.getCheckedRadioButtonId() != -1 &&
                            RgIce.getCheckedRadioButtonId() != -1){
                        Flipper.showNext();
                    } else if (RgTemp.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(getApplicationContext(), "핫/아이스를 선택해 주세요.",
                                Toast.LENGTH_SHORT).show();
                    } else if (RgSize.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(getApplicationContext(), "사이즈를 선택해 주세요.",
                                Toast.LENGTH_SHORT).show();
                    } else if (RgDensity.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(getApplicationContext(), "농도를 선택해 주세요.",
                                Toast.LENGTH_SHORT).show();
                    } else if (RgIce.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(getApplicationContext(), "얼음을 선택해 주세요.",
                                Toast.LENGTH_SHORT).show();
                    }
                }

                // 수령할 커피 이미지
                if (In.isSelected()){
                    if (Hot.isChecked()){
                        if (Whipping.isChecked()){
                            ImgCoffee.setImageResource(R.drawable.hotcoffeeinwhip);
                        }else {
                            if (Americano.isChecked()){
                                ImgCoffee.setImageResource(R.drawable.hotamein);
                            } else if (CafeLatte.isChecked()) {
                                ImgCoffee.setImageResource(R.drawable.hotlattein);
                            } else if (Cappuccino.isChecked()) {
                                ImgCoffee.setImageResource(R.drawable.hotcappuin);
                            }else {
                                ImgCoffee.setImageResource(R.drawable.hotmochain);
                            }
                        }
                    }else {
                        if (Whipping.isChecked()){
                            if (Americano.isChecked()){
                                ImgCoffee.setImageResource(R.drawable.iceameinwhip);
                            } else if (CafeLatte.isChecked()) {
                                ImgCoffee.setImageResource(R.drawable.icelatteinwhip);
                            } else if (Cappuccino.isChecked()) {
                                ImgCoffee.setImageResource(R.drawable.icecappuinwhip);
                            }else {
                                ImgCoffee.setImageResource(R.drawable.icemochainwhip);
                            }
                        }else {
                            if (Americano.isChecked()){
                                ImgCoffee.setImageResource(R.drawable.iceamein);
                            } else if (CafeLatte.isChecked()) {
                                ImgCoffee.setImageResource(R.drawable.icelattein);
                            } else if (Cappuccino.isChecked()) {
                                ImgCoffee.setImageResource(R.drawable.icecappuin);
                            }else {
                                ImgCoffee.setImageResource(R.drawable.icemochain);
                            }
                        }
                    }
                }else {
                    if (Hot.isChecked()){
                        ImgCoffee.setImageResource(R.drawable.hotcoffeeout);
                    }else {
                        if (Whipping.isChecked()){
                            if (Americano.isChecked()){
                                ImgCoffee.setImageResource(R.drawable.iceameoutwhip);
                            } else if (CafeLatte.isChecked()) {
                                ImgCoffee.setImageResource(R.drawable.icelatteoutwhip);
                            } else if (Cappuccino.isChecked()) {
                                ImgCoffee.setImageResource(R.drawable.icecappuoutwhip);
                            }else {
                                ImgCoffee.setImageResource(R.drawable.icemochaoutwhip);
                            }
                        }else {
                            if (Americano.isChecked()){
                                ImgCoffee.setImageResource(R.drawable.iceameout);
                            } else if (CafeLatte.isChecked()) {
                                ImgCoffee.setImageResource(R.drawable.icelatteout);
                            } else if (Cappuccino.isChecked()) {
                                ImgCoffee.setImageResource(R.drawable.icecappuout);
                            }else {
                                ImgCoffee.setImageResource(R.drawable.icemochaout);
                            }
                        }
                    }
                }

                // 핫/아이스
                if (Hot.isChecked()){
                    temp = "핫";
                    ice = "";
                } else if (Iced.isChecked()) {
                    temp = "아이스";
                    if (Little.isChecked()) {
                        ice = ", 얼음 적게";
                    }
                    else if (CommonlyIce.isChecked()) ice = ", 얼음 보통";
                    else ice = ", 얼음 많이";
                }

                // 사이즈
                if (Medium.isChecked()) size = ", 미디움";
                else if (Large.isChecked()) size = ", 라지";
                else size = ", 벤티";

                // 농도
                if (Commonly.isChecked()) density = ", 농도 보통";
                else density = ", 농도 연하게";

                // 기타 옵션
                if (Whipping.isChecked()) whipping = ", 휘핑 추가";
                else whipping = "";

                if (Syrup.isChecked()) syrup = ", 시럽 추가";
                else syrup = "";

                if (Shot.isChecked()) shot = ", 샷 추가";
                else shot = "";

                if (count == 1){
                    Cart1.setText(coffee);
                    coffee1 = coffee;
                    Cart1_1.setText("(" + temp + size + density + ice + whipping + syrup + shot + ")");
                    option1 = Cart1_1.getText().toString();
                    option1 = option1.substring(1, Cart1_1.getText().toString().length()-1);
                    Cost1.setText(cost + "원");
                    Count1.setText(" " + count1 + " ");
                    cost1 = cost;
                    totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                    WillPay.setText("결제 예정 금액: " + totalCost + "원");
                    count++;
                } else if (count == 2){
                    Lay2.setVisibility(View.VISIBLE);
                    Cart2.setText(coffee);
                    coffee2 = coffee;
                    Cart2_1.setText("(" + temp + size + density + ice + whipping + syrup + shot + ")");
                    option2 = Cart2_1.getText().toString();
                    option2 = option2.substring(1, Cart2_1.getText().toString().length()-1);
                    Cost2.setText(cost + "원");
                    Count2.setText(" " + count2 + " ");
                    cost2 = cost;
                    totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                    WillPay.setText("결제 예정 금액: " + totalCost + "원");
                    count++;
                } else if (count == 3) {
                    Lay3.setVisibility(View.VISIBLE);
                    Cart3.setText(coffee);
                    coffee3 = coffee;
                    Cart3_1.setText("(" + temp + size + density + ice + whipping + syrup + shot + ")");
                    option3 = Cart3_1.getText().toString();
                    option3 = option3.substring(1, Cart3_1.getText().toString().length()-1);
                    Cost3.setText(cost + "원");
                    Count3.setText(" " + count3 + " ");
                    cost3 = cost;
                    totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                    WillPay.setText("결제 예정 금액: " + totalCost + "원");
                    count++;
                } else if (count == 4) {
                    Lay4.setVisibility(View.VISIBLE);
                    Cart4.setText(coffee);
                    coffee4 = coffee;
                    Cart4_1.setText("(" + temp + size + density + ice + whipping + syrup + shot + ")");
                    option4 = Cart4_1.getText().toString();
                    option4 = option4.substring(1, Cart4_1.getText().toString().length()-1);
                    Cost4.setText(cost + "원");
                    Count4.setText(" " + count4 + " ");
                    cost4 = cost;
                    WillPay.setText(cost1);
                    totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                    WillPay.setText("결제 예정 금액: " + totalCost + "원");
                    count++;
                } else {
                    Lay5.setVisibility(View.VISIBLE);
                    Cart5.setText(coffee);
                    coffee5 = coffee;
                    Cart5_1.setText("(" + temp + size + density + ice + whipping + syrup + shot + ")");
                    option5 = Cart5_1.getText().toString();
                    option5 = option5.substring(1, Cart5_1.getText().toString().length()-1);
                    Cost5.setText(cost + "원");
                    Count5.setText(" " + count5 + " ");
                    cost5 = cost;
                    totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                    WillPay.setText("결제 예정 금액: " + totalCost + "원");
                    count++;
                }
            }
        });


        // 장바구니 ===========================================================================================================

        // 수량 추가
        Plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count1++;
                totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                WillPay.setText("결제 예정 금액: " + totalCost + "원");
                Count1.setText(" " + count1 + " ");
            }
        });

        Plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count2++;
                totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                WillPay.setText("결제 예정 금액: " + totalCost + "원");
                Count2.setText(" " + count2 + " ");
            }
        });

        Plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count3++;
                totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                WillPay.setText("결제 예정 금액: " + totalCost + "원");
                Count3.setText(" " + count3 + " ");
            }
        });

        Plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count4++;
                totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                WillPay.setText("결제 예정 금액: " + totalCost + "원");
                Count4.setText(" " + count4 + " ");
            }
        });

        Plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count5++;
                totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                WillPay.setText("결제 예정 금액: " + totalCost + "원");
                Count5.setText(" " + count5 + " ");
            }
        });

        // 수량 감소
        Minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count1 > 1){
                    count1--;
                    totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                    WillPay.setText("결제 예정 금액: " + totalCost + "원");
                    Count1.setText(" " + count1 + " ");
                }
            }
        });

        Minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count2 > 1){
                    count2--;
                    totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                    WillPay.setText("결제 예정 금액: " + totalCost + "원");
                    Count2.setText(" " + count2 + " ");
                }
            }
        });

        Minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count3 > 1){
                    count3--;
                    totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                    WillPay.setText("결제 예정 금액: " + totalCost + "원");
                    Count3.setText(" " + count3 + " ");
                }
            }
        });

        Minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count4 > 1){
                    count4--;
                    totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                    WillPay.setText("결제 예정 금액: " + totalCost + "원");
                    Count4.setText(" " + count4 + " ");
                }
            }
        });

        Minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count5 > 1){
                    count5--;
                    totalCost = cost1*count1 + cost2*count2 + cost3*count3 + cost4*count4 + cost5*count5;
                    WillPay.setText("결제 예정 금액: " + totalCost + "원");
                    Count5.setText(" " + count5 + " ");
                }
            }
        });

        // 삭제
        Remove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (coffee2 == ""){
                    coffee1 = "";
                    cost1 = 0;
                    count1 = 1;
                    count--;
                    Americano.setChecked(false);
                    CafeLatte.setChecked(false);
                    Cappuccino.setChecked(false);
                    CafeMocha.setChecked(false);
                    RgTemp.clearCheck();
                    RgSize.clearCheck();
                    RgDensity.clearCheck();
                    RgIce.clearCheck();
                    Whipping.setChecked(false);
                    Syrup.setChecked(false);
                    Shot.setChecked(false);
                    Flipper.showPrevious();
                    Flipper.showPrevious();
                }else{
                    coffee1 = coffee2;
                    coffee2 = coffee3;
                    coffee3 = coffee4;
                    coffee4 = coffee5;
                    Cart1.setText(coffee1);
                    Cart2.setText(coffee2);
                    Cart3.setText(coffee3);
                    Cart4.setText(coffee4);
                    cost1 = cost2;
                    cost2 = cost3;
                    cost3 = cost4;
                    cost4 = cost5;
                    Cost1.setText(cost1 + "원");
                    Cost2.setText(cost2 + "원");
                    Cost3.setText(cost3 + "원");
                    Cost4.setText(cost4 + "원");
                    count1 = count2;
                    count2 = count3;
                    count3 = count4;
                    count4 = count5;
                    Count1.setText(" " + count1 + " ");
                    Count2.setText(" " + count2 + " ");
                    Count3.setText(" " + count3 + " ");
                    Count4.setText(" " + count4 + " ");
                    option1 = option2;
                    option2 = option3;
                    option3 = option4;
                    option4 = option5;
                    Cart1_1.setText("(" + option1 + ")");
                    Cart2_1.setText("(" + option2 + ")");
                    Cart3_1.setText("(" + option3 + ")");
                    Cart4_1.setText("(" + option4 + ")");
                    count--;
                    if (coffee5 == "") {
                        if (coffee4 == "") {
                            if (coffee3 == "") Lay2.setVisibility(View.INVISIBLE);
                            else Lay3.setVisibility(View.INVISIBLE);
                        } else Lay4.setVisibility(View.INVISIBLE);
                    } else Lay5.setVisibility(View.INVISIBLE);
                }
            }
        });

        Remove2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (coffee3 == ""){
                    coffee2 = "";
                    cost2 = 0;
                    count2 = 1;
                    count--;
                    Lay2.setVisibility(View.INVISIBLE);
                }else{
                    coffee2 = coffee3;
                    coffee3 = coffee4;
                    coffee4 = coffee5;
                    Cart2.setText(coffee2);
                    Cart3.setText(coffee3);
                    Cart4.setText(coffee4);
                    cost2 = cost3;
                    cost3 = cost4;
                    cost4 = cost5;
                    Cost2.setText(cost2 + "원");
                    Cost3.setText(cost3 + "원");
                    Cost4.setText(cost4 + "원");
                    count2 = count3;
                    count3 = count4;
                    count4 = count5;
                    Count2.setText(" " + count2 + " ");
                    Count3.setText(" " + count3 + " ");
                    Count4.setText(" " + count4 + " ");
                    option2 = option3;
                    option3 = option4;
                    option4 = option5;
                    Cart2_1.setText("(" + option2 + ")");
                    Cart3_1.setText("(" + option3 + ")");
                    Cart4_1.setText("(" + option4 + ")");
                    count--;
                    if (coffee5 == "") {
                        if (coffee4 == "") Lay3.setVisibility(View.INVISIBLE);
                        else Lay4.setVisibility(View.INVISIBLE);
                    } else Lay5.setVisibility(View.INVISIBLE);
                }
            }
        });

        Remove3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (coffee4 == ""){
                    coffee3 = "";
                    cost3 = 0;
                    count3 = 1;
                    count--;
                    Lay3.setVisibility(View.INVISIBLE);
                }else{
                    coffee3 = coffee4;
                    coffee4 = coffee5;
                    Cart3.setText(coffee3);
                    Cart4.setText(coffee4);
                    cost3 = cost4;
                    cost4 = cost5;
                    Cost3.setText(cost3 + "원");
                    Cost4.setText(cost4 + "원");
                    count3 = count4;
                    count4 = count5;
                    Count3.setText(" " + count3 + " ");
                    Count4.setText(" " + count4 + " ");
                    option3 = option4;
                    option4 = option5;
                    Cart3_1.setText("(" + option3 + ")");
                    Cart4_1.setText("(" + option4 + ")");
                    count--;
                    if (coffee5 == "") Lay4.setVisibility(View.INVISIBLE);
                    else Lay5.setVisibility(View.INVISIBLE);
                }
            }
        });

        Remove4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (coffee5 == ""){
                    coffee4 = "";
                    cost4 = 0;
                    count4 = 1;
                    count--;
                    Lay4.setVisibility(View.INVISIBLE);
                }else{
                    coffee4 = coffee5;
                    Cart4.setText(coffee4);
                    cost4 = cost5;
                    Cost4.setText(cost4 + "원");
                    count4 = count5;
                    Count4.setText(" " + count4 + " ");
                    option4 = option5;
                    Cart4_1.setText("(" + option4 + ")");
                    count--;
                    Lay5.setVisibility(View.INVISIBLE);
                }
            }
        });

        Remove5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coffee5 = "";
                cost5 = 0;
                count5 = 1;
                count--;
                Lay5.setVisibility(View.INVISIBLE);
            }
        });

        // 장바구니 추가
        More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count <  6){
                    Americano.setChecked(false);
                    CafeLatte.setChecked(false);
                    Cappuccino.setChecked(false);
                    CafeMocha.setChecked(false);
                    RgTemp.clearCheck();
                    RgSize.clearCheck();
                    RgDensity.clearCheck();
                    RgIce.clearCheck();
                    Whipping.setChecked(false);
                    Syrup.setChecked(false);
                    Shot.setChecked(false);
                    Flipper.showPrevious();
                    Flipper.showPrevious();
                }else Toast.makeText(getApplicationContext(), "장바구니는 최대 5종류까지 담을 수 있습니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // 다음
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Flipper.showNext();
            }
        });


        // 포인트 적립 =========================================================================================================

        // 전화번호 입력
        for (i=0; i<numbtnId.length; i++) {
            final int index;
            index = i;
            numButton[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Tel.getText().toString().length() < 13){
                        if (Tel.getText().toString().length() == 3 || Tel.getText().toString().length() == 8){
                            Tel.setText(tel + "-");
                        }
                        tel = Tel.getText().toString() + numButton[index].getText().toString();
                        Tel.setText(tel);
                    }
                }
            });
        }

        // 지우기
        Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Tel.length() > 3) {
                    if (Tel.length() == 5 || Tel.length() == 10){
                        tel = tel.substring(0, Tel.length() - 2);
                        Tel.setText(tel);
                    }else{
                        tel = tel.substring(0, Tel.length() - 1);
                        Tel.setText(tel);
                    }
                }else {
                    Toast.makeText(getApplicationContext(), "전화번호를 입력해 주세요.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 적립 확인
        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tel.length() == 13){
                    TEL = tel.substring(0, 4) + "****" + tel.substring(8, 13);
                    point = totalCost/50;
                    found = false;
                    for (n=0; n<phones.size(); n++){
                        if(phones.get(n).equals(tel)){
                            POINT = points.get(n);
                            found = true;
                            break;
                        }
                    }
                    if (found == false) POINT = 0;
                    willPay.setText("결제 예정 금액: " + totalCost + "원");
                    havePoint.setText("보유 포인트: " + POINT + "p");
                    canPoint.setText("남은 포인트: " + POINT + "p");
                    IntPoint = 0;
                    Ok.setSelected(true);
                    Flipper.showNext();
                }else Toast.makeText(getApplicationContext(), "올바른 전화번호 형식이 아닙니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // 이전
        Pre3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tel.setText("010-");
                Flipper.showPrevious();
            }
        });

        // 적립 안 함
        NoPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tel = "";
                TEL = tel;
                point = 0;
                Tel.setText("010-");
                Ok.setSelected(false);
                Flipper.showNext();
                Flipper.showNext();
            }
        });


        // 포인트 사용 ==============================================================================================================

        // 포인트 입력
        for (n=0; n<pointbtnId.length; n++) {
            final int index1;
            index1 = n;
            pointButton[index1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Point = usePoint.getText().toString();
                    Point = Point.substring(0, usePoint.length() - 1) + pointButton[index1].getText().toString();
                    IntPoint = Integer.parseInt(Point);
                    if (IntPoint <= POINT && IntPoint > 0){  // 입력된 포인트가 0 초과 보유 포인트 이하라면
                        howPoint = POINT - IntPoint;
                        willpay = totalCost - IntPoint;
                        canPoint.setText("남은 포인트: " + howPoint + "p");
                        usePoint.setText(IntPoint + "p");
                        willPay.setText("결제 예정 금액: " + willpay + "원");
                    }else {
                        Toast.makeText(getApplicationContext(), "포인트가 부족합니다.",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        // 보유 포인트 클릭시
        havePoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntPoint = POINT;
                howPoint = 0;
                willpay = totalCost - IntPoint;
                canPoint.setText("남은 포인트: " + howPoint + "p");
                usePoint.setText(IntPoint + "p");
                willPay.setText("결제 예정 금액: " + willpay + "원");
            }
        });

        // 지우기
        DEl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usePoint.length() > 2){
                    Point = usePoint.getText().toString();
                    Point = Point.substring(0, usePoint.length() - 2);
                    IntPoint = Integer.parseInt(Point);
                    howPoint = POINT - IntPoint;
                    willpay = totalCost - IntPoint;
                    canPoint.setText("남은 포인트: " + howPoint + "p");
                    usePoint.setText(IntPoint + "p");
                    willPay.setText("결제 예정 금액: " + willpay + "원");
                } else if (usePoint.length() == 2) {
                    Point = "0";
                    IntPoint = Integer.parseInt(Point);
                    howPoint = POINT - IntPoint;
                    willpay = totalCost - IntPoint;
                    canPoint.setText("남은 포인트: " + howPoint + "p");
                    usePoint.setText(IntPoint + "p");
                    willPay.setText("결제 예정 금액: " + willpay + "원");
                }
            }
        });

        // 사용 확인
        oK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (IntPoint < 500){
                    Toast.makeText(getApplicationContext(), "500포인트부터 사용 가능합니다.",
                            Toast.LENGTH_SHORT).show();
                }else {
                    Flipper.showNext();
                }
            }
        });

        // 이전
        Pre4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usePoint.setText("0p");
                Flipper.showPrevious();
            }
        });

        // 사용 안 함
        NoUse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntPoint = 0;
                willpay = totalCost;
                usePoint.setText("0p");
                Flipper.showNext();
            }
        });



        // 결제 방식 ==================================================================================================================

        // 현금
        Cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pay = Cash.getText().toString();
                found = false;
                if (tel != ""){
                    NewPOINT = POINT - IntPoint + point;
                    for (n=0; n<phones.size(); n++){
                        if(phones.get(n).equals(tel)){
                            points.set(n, NewPOINT);
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        phones.add(tel);
                        points.add(NewPOINT);
                    }
                }
                Flipper.showNext();}
        });

        // 카드
        Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pay = Card.getText().toString();
                found = false;
                if (tel != "x"){
                    NewPOINT = POINT - IntPoint + point;
                    for (n=0; n<phones.size(); n++){
                        if(phones.get(n).equals(tel)){
                            points.set(n, NewPOINT);
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        phones.add(tel);
                        points.add(NewPOINT);
                    }
                }
                Flipper.showNext();}
        });

        // 상품권
        Voucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pay = Voucher.getText().toString();
                found = false;
                if (tel != "x"){
                    NewPOINT = POINT - IntPoint + point;
                    for (n=0; n<phones.size(); n++){
                        if(phones.get(n).equals(tel)){
                            points.set(n, NewPOINT);
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        phones.add(tel);
                        points.add(NewPOINT);
                    }
                }
                Flipper.showNext();}
        });

        // 이전
        Pre5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Ok.isSelected()) {
                    Flipper.showPrevious();
                }else {
                    Flipper.showPrevious();
                    Flipper.showPrevious();
                }
            }
        });


        // 결제 완료 ===========================================================================================================

        // 영수증 출력
        YesReceipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (coffee5.equals("")){
                    if (coffee4.equals("")){
                        if (coffee3.equals("")){
                            if (coffee2.equals("")){
                                if (tel.equals("")){
                                    Receipt.setText("\n이용방식: " + where +
                                            "\n-\n메뉴: " + coffee1 + "\n옵션: " + option1 + "\n수량: " + count1 + "\n금액: " + cost1*count1 +
                                            "원\n-\n총 금액: " + totalCost +
                                            "원\n========================\n결제 금액: " + totalCost +
                                            "원\n결제 수단: " + pay);
                                }else {
                                    Receipt.setText("\n이용방식: " + where +
                                            "\n-\n메뉴: " + coffee1 + "\n옵션: " + option1 + "\n수량: " + count1 + "\n금액: " + cost1*count1 +
                                            "원\n-\n총 금액: " + totalCost +
                                            "원\n========================\n결제 금액: " + willpay + "원\n사용한 포인트: " + IntPoint +
                                            "p\n보유 포인트: " + NewPOINT + "p (+" + point + "p)\n전화번호: " + TEL + "\n결제 수단: " + pay);
                                }
                            }else {
                                if (tel.equals("")){
                                    Receipt.setText("\n이용방식: " + where +
                                            "\n-\n메뉴1: " + coffee1 + "\n옵션: " + option1 + "\n수량: " + count1 + "\n금액: " + cost1*count1 +
                                            "원\n-\n메뉴2: " + coffee2 + "\n옵션: " + option2 + "\n수량: " + count2 + "\n금액: " + cost2*count2 +
                                            "원\n-\n총 금액: " + totalCost +
                                            "원\n========================\n결제 금액: " + totalCost +
                                            "원\n결제 수단: " + pay);
                                }else {
                                    Receipt.setText("\n이용방식: " + where +
                                            "\n-\n메뉴1: " + coffee1 + "\n옵션: " + option1 + "\n수량: " + count1 + "\n금액: " + cost1*count1 +
                                            "원\n-\n메뉴2: " + coffee2 + "\n옵션: " + option2 + "\n수량: " + count2 + "\n금액: " + cost2*count2 +
                                            "원\n-\n총 금액: " + totalCost +
                                            "원\n========================\n결제 금액: " + willpay + "원\n사용한 포인트: " + IntPoint +
                                            "p\n보유 포인트: " + NewPOINT + "p (+" + point + "p)\n전화번호: " + TEL + "\n결제 수단: " + pay);
                                }
                            }
                        }else {
                            if (tel.equals("")){
                                Receipt.setText("\n이용방식: " + where +
                                        "\n-\n메뉴1: " + coffee1 + "\n옵션: " + option1 + "\n수량: " + count1 + "\n금액: " + cost1*count1 +
                                        "원\n-\n메뉴2: " + coffee2 + "\n옵션: " + option2 + "\n수량: " + count2 + "\n금액: " + cost2*count2 +
                                        "원\n-\n메뉴3: " + coffee3 + "\n옵션: " + option3 + "\n수량: " + count3 + "\n금액: " + cost3*count3 +
                                        "원\n-\n총 금액: " + totalCost +
                                        "원\n========================\n결제 금액: " + totalCost +
                                        "원\n결제 수단: " + pay);
                            }else {
                                Receipt.setText("\n이용방식: " + where +
                                        "\n-\n메뉴1: " + coffee1 + "\n옵션: " + option1 + "\n수량: " + count1 + "\n금액: " + cost1*count1 +
                                        "원\n-\n메뉴2: " + coffee2 + "\n옵션: " + option2 + "\n수량: " + count2 + "\n금액: " + cost2*count2 +
                                        "원\n-\n메뉴3: " + coffee3 + "\n옵션: " + option3 + "\n수량: " + count3 + "\n금액: " + cost3*count3 +
                                        "원\n-\n총 금액: " + totalCost +
                                        "원\n========================\n결제 금액: " + willpay + "원\n사용한 포인트: " + IntPoint +
                                        "p\n보유 포인트: " + NewPOINT + "p (+" + point + "p)\n전화번호: " + TEL + "\n결제 수단: " + pay);
                            }
                        }
                    }else {
                        if (tel.equals("")){
                            Receipt.setText("\n이용방식: " + where +
                                    "\n-\n메뉴1: " + coffee1 + "\n옵션: " + option1 + "\n수량: " + count1 + "\n금액: " + cost1*count1 +
                                    "원\n-\n메뉴2: " + coffee2 + "\n옵션: " + option2 + "\n수량: " + count2 + "\n금액: " + cost2*count2 +
                                    "원\n-\n메뉴3: " + coffee3 + "\n옵션: " + option3 + "\n수량: " + count3 + "\n금액: " + cost3*count3 +
                                    "원\n-\n메뉴4: " + coffee4 + "\n옵션: " + option4 + "\n수량: " + count4 + "\n금액: " + cost4*count4 +
                                    "원\n-\n총 금액: " + totalCost +
                                    "원\n========================\n결제 금액: " + totalCost +
                                    "원\n결제 수단: " + pay);
                        }else {
                            Receipt.setText("\n이용방식: " + where +
                                    "\n-\n메뉴1: " + coffee1 + "\n옵션: " + option1 + "\n수량: " + count1 + "\n금액: " + cost1*count1 +
                                    "원\n-\n메뉴2: " + coffee2 + "\n옵션: " + option2 + "\n수량: " + count2 + "\n금액: " + cost2*count2 +
                                    "원\n-\n메뉴3: " + coffee3 + "\n옵션: " + option3 + "\n수량: " + count3 + "\n금액: " + cost3*count3 +
                                    "원\n-\n메뉴4: " + coffee4 + "\n옵션: " + option4 + "\n수량: " + count4 + "\n금액: " + cost4*count4 +
                                    "원\n-\n총 금액: " + totalCost +
                                    "원\n========================\n결제 금액: " + willpay + "원\n사용한 포인트: " + IntPoint +
                                    "p\n보유 포인트: " + NewPOINT + "p (+" + point + "p)\n전화번호: " + TEL + "\n결제 수단: " + pay);
                        }
                    }
                }else {
                    if (tel.equals("")){
                        Receipt.setText("\n이용방식: " + where +
                                "\n-\n메뉴1: " + coffee1 + "\n옵션: " + option1 + "\n수량: " + count1 + "\n금액: " + cost1*count1 +
                                "원\n-\n메뉴2: " + coffee2 + "\n옵션: " + option2 + "\n수량: " + count2 + "\n금액: " + cost2*count2 +
                                "원\n-\n메뉴3: " + coffee3 + "\n옵션: " + option3 + "\n수량: " + count3 + "\n금액: " + cost3*count3 +
                                "원\n-\n메뉴4: " + coffee4 + "\n옵션: " + option4 + "\n수량: " + count4 + "\n금액: " + cost4*count4 +
                                "원\n-\n메뉴5: " + coffee5 + "\n옵션: " + option5 + "\n수량: " + count5 + "\n금액: " + cost5*count5 +
                                "원\n-\n총 금액: " + totalCost +
                                "원\n========================\n결제 금액: " + totalCost +
                                "원\n결제 수단: " + pay);
                    }else {
                        Receipt.setText("\n이용방식: " + where +
                                "\n-\n메뉴1: " + coffee1 + "\n옵션: " + option1 + "\n수량: " + count1 + "\n금액: " + cost1*count1 +
                                "원\n-\n메뉴2: " + coffee2 + "\n옵션: " + option2 + "\n수량: " + count2 + "\n금액: " + cost2*count2 +
                                "원\n-\n메뉴3: " + coffee3 + "\n옵션: " + option3 + "\n수량: " + count3 + "\n금액: " + cost3*count3 +
                                "원\n-\n메뉴4: " + coffee4 + "\n옵션: " + option4 + "\n수량: " + count4 + "\n금액: " + cost4*count4 +
                                "원\n-\n메뉴5: " + coffee5 + "\n옵션: " + option5 + "\n수량: " + count5 + "\n금액: " + cost5*count5 +
                                "원\n-\n총 금액: " + totalCost +
                                "원\n========================\n결제 금액: " + willpay + "원\n사용한 포인트: " + IntPoint +
                                "p\n보유 포인트: " + NewPOINT + "p (+" + point + "p)\n전화번호: " + TEL + "\n결제 수단: " + pay);
                    }
                }
                Receipt.setVisibility(View.VISIBLE);
                OkReceipt.setVisibility(View.VISIBLE);
            }
        });

        // 영수증 출력 안 함
        NoReceipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (YesReceipt.isSelected() == false){
                    Flipper.showNext();
                }
            }
        });

        // 확인
        OkReceipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Flipper.showNext();
            }
        });


        // 커피 수령 ==================================================================================================================

        Take.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                In.setSelected(false);
                Out.setSelected(false);
                Americano.setChecked(false);
                CafeLatte.setChecked(false);
                Cappuccino.setChecked(false);
                CafeMocha.setChecked(false);
                RgTemp.clearCheck();
                RgSize.clearCheck();
                RgDensity.clearCheck();
                RgIce.clearCheck();
                Whipping.setChecked(false);
                Syrup.setChecked(false);
                Shot.setChecked(false);
                count = 1;
                count1 = 1;
                count2 = 1;
                count3 = 1;
                count4 = 1;
                count5 = 1;
                coffee1 = "";
                coffee2 = "";
                coffee3 = "";
                coffee4 = "";
                coffee5 = "";
                cost1 = 0;
                cost2 = 0;
                cost3 = 0;
                cost4 = 0;
                cost5 = 0;
                Lay2.setVisibility(View.INVISIBLE);
                Lay3.setVisibility(View.INVISIBLE);
                Lay4.setVisibility(View.INVISIBLE);
                Lay5.setVisibility(View.INVISIBLE);
                Tel.setText("010-");
                Ok.setSelected(false);
                usePoint.setText("0p");
                option1 = "";
                option2 = "";
                option3 = "";
                option4 = "";
                option5 = "";
                Cash.setSelected(false);
                Card.setSelected(false);
                Voucher.setSelected(false);
                YesReceipt.setSelected(false);
                Receipt.setVisibility(View.INVISIBLE);
                OkReceipt.setVisibility(View.INVISIBLE);
                Flipper.showNext();
            }
        });
    }}