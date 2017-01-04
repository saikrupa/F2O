package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by SaiKrupa on 11/26/2016.
 */

public class AddNewInspectionActivity extends Activity implements View.OnClickListener{
    LinearLayout liErosioncontrol, liGeneralsafety, liUtilities, liHousekeeping, liFireprotection, liExcavation, liFallprotection, liEquipment, liScaffold, liTools, liSubcontractor,
            liErosioncontrollineitem, liGeneralsafetylineitems, liUtilitylineitems, liHousekeepinglineitems, liFireprotectionlineitems,
            liEvacuationlineitems, liFallprotectionlineitems, liEquipmentlineitems, liScaffoldlineitems, liToolslineitems, liSubcontractorlineitems;

    int Count = 0, Count1 = 0, Count2 = 0, Count3 = 0, Count4 = 0, Count5 = 0, Count6 = 0, Count7 = 0, Count8 = 0, Count9 = 0,
            Count10 = 0, OK = 5, ACT = 6, NA = 7;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_items);
        intiaalise();
    }



public void intiaalise() {


    liErosioncontrol = (LinearLayout)findViewById(R.id.liErosioncontrol);
    liErosioncontrol.setOnClickListener(AddNewInspectionActivity.this);
    liGeneralsafety = (LinearLayout) findViewById(R.id.liGeneralsafety);
    liGeneralsafety.setOnClickListener(AddNewInspectionActivity.this);
    liUtilities = (LinearLayout) findViewById(R.id.liUtilities);
    liUtilities.setOnClickListener(AddNewInspectionActivity.this);
    liHousekeeping = (LinearLayout) findViewById(R.id.liHousekeeping);
    liHousekeeping.setOnClickListener(AddNewInspectionActivity.this);
    liFireprotection = (LinearLayout) findViewById(R.id.liFireprotection);
    liFireprotection.setOnClickListener(AddNewInspectionActivity.this);
    liExcavation = (LinearLayout)findViewById(R.id.liExcavation);
    liExcavation.setOnClickListener(AddNewInspectionActivity.this);
    liFallprotection = (LinearLayout) findViewById(R.id.liFallprotection);
    liFallprotection.setOnClickListener(AddNewInspectionActivity.this);
    liEquipment = (LinearLayout) findViewById(R.id.liEquipment);
    liEquipment.setOnClickListener(AddNewInspectionActivity.this);
    liScaffold = (LinearLayout) findViewById(R.id.liScaffold);
    liScaffold.setOnClickListener(AddNewInspectionActivity.this);
    liTools = (LinearLayout) findViewById(R.id.liTools);
    liTools.setOnClickListener(AddNewInspectionActivity.this);
    liSubcontractor = (LinearLayout) findViewById(R.id.liSubcontractor);
    liSubcontractor.setOnClickListener(AddNewInspectionActivity.this);
    liErosioncontrollineitem = (LinearLayout) findViewById(R.id.liErosioncontrollineitem);
    liGeneralsafetylineitems = (LinearLayout) findViewById(R.id.liGeneralsafetylineitems);
    liUtilitylineitems = (LinearLayout) findViewById(R.id.liUtilitylineitems);
    liHousekeepinglineitems = (LinearLayout) findViewById(R.id.liHousekeepinglineitems);
    liFireprotectionlineitems = (LinearLayout) findViewById(R.id.liFireprotectionlineitems);
    liEvacuationlineitems = (LinearLayout) findViewById(R.id.liEvacuationlineitems);
    liFallprotectionlineitems = (LinearLayout) findViewById(R.id.liFallprotectionlineitems);
    liEquipmentlineitems = (LinearLayout) findViewById(R.id.liEquipmentlineitems);
    liScaffoldlineitems = (LinearLayout) findViewById(R.id.liScaffoldlineitems);
    liToolslineitems = (LinearLayout) findViewById(R.id.liToolslineitems);
    liSubcontractorlineitems = (LinearLayout) findViewById(R.id.liSubcontractorlineitems);

}

    public void ivBack(View v) {
        finish();
    }

    public void btnPhotos(View v) {
        Intent i = new Intent(getApplicationContext(), PhotosActivity.class);
        startActivity(i);
    }


    public void btnComments(View v) {
        Intent i = new Intent(getApplicationContext(), CommentsActivity.class);
        startActivity(i);
    }

   /* View.OnClickListener layoutclicklistener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {


            if (v.getId() == R.id.liErosioncontrol) {
                Count++;
                if (Count % 2 == 1) {
                    hideAll();
                    Count++;
                    liErosioncontrollineitem.setVisibility(View.VISIBLE);


                } else if (Count % 2 == 0) {
                    hideAll();

                }

            } else if (v.getId() == R.id.liGeneralsafety) {
                Count1++;
                if (Count1 % 2 == 1) {
                    hideAll();

                    Count1++;
                    liGeneralsafetylineitems.setVisibility(View.VISIBLE);


                } else if (Count1 % 2 == 0) {
                    hideAll();

                }
            } else if (v.getId() == R.id.liUtilities) {
                Count2++;
                if (Count2 % 2 == 1) {
                    hideAll();
                    Count2++;

                    liUtilitylineitems.setVisibility(View.VISIBLE);


                } else if (Count2 % 2 == 0) {
                    hideAll();

                }
            } else if (v.getId() == R.id.liHousekeeping) {
                Count3++;
                if (Count3 % 2 == 1) {
                    hideAll();
                    Count3++;
                    liHousekeepinglineitems.setVisibility(View.VISIBLE);


                } else if (Count3 % 2 == 0) {
                    hideAll();

                }
            } else if (v.getId() == R.id.liFireprotection) {
                Count4++;
                if (Count4 % 2 == 1) {

                    hideAll();
                    Count4++;
                    liFireprotectionlineitems.setVisibility(View.VISIBLE);


                } else if (Count4 % 2 == 0) {
                    hideAll();

                }
            } else if (v.getId() == R.id.liExcavation) {
                Count5++;
                if (Count5 % 2 == 1) {
                    hideAll();
                    Count5++;
                    liEvacuationlineitems.setVisibility(View.VISIBLE);


                } else if (Count5 % 2 == 0) {
                    hideAll();

                }
            } else if (v.getId() == R.id.liFallprotection) {
                Count6++;
                if (Count6 % 2 == 1) {
                    hideAll();
                    Count6++;
                    liFallprotectionlineitems.setVisibility(View.VISIBLE);


                } else if (Count6 % 2 == 0) {
                    hideAll();

                }
            } else if (v.getId() == R.id.liEquipment) {
                Count7++;
                if (Count7 % 2 == 1) {
                    hideAll();
                    Count7++;

                    liEquipmentlineitems.setVisibility(View.VISIBLE);


                } else if (Count7 % 2 == 0) {
                    hideAll();

                }
            } else if (v.getId() == R.id.liScaffold) {
                Count8++;
                if (Count8 % 2 == 1) {
                    hideAll();
                    Count8++;
                    liScaffoldlineitems.setVisibility(View.VISIBLE);


                } else if (Count8 % 2 == 0) {
                    hideAll();

                }
            } else if (v.getId() == R.id.liTools) {
                Count9++;
                if (Count9 % 2 == 1) {
                    hideAll();

                    Count9++;
                    liToolslineitems.setVisibility(View.VISIBLE);

                } else if (Count9 % 2 == 0) {
                    hideAll();


                }
            } else if (v.getId() == R.id.liSubcontractor) {
                Count10++;
                if (Count10 % 2 == 1) {
                    hideAll();
                    Count10++;
                    liSubcontractorlineitems.setVisibility(View.VISIBLE);
                } else if (Count10 % 2 == 0) {
                    hideAll();
                }

            }
        }

    };*/


    public void hideAll() {
        Count = 0;
        Count1 = 0;
        Count2 = 0;
        Count3 = 0;
        Count4 = 0;
        Count5 = 0;
        Count6 = 0;
        Count7 = 0;
        Count8 = 0;
        Count9 = 0;
        Count10 = 0;
        liErosioncontrollineitem.setVisibility(View.GONE);
        liGeneralsafetylineitems.setVisibility(View.GONE);
        liUtilitylineitems.setVisibility(View.GONE);
        liHousekeepinglineitems.setVisibility(View.GONE);
        liFireprotectionlineitems.setVisibility(View.GONE);
        liEvacuationlineitems.setVisibility(View.GONE);
        liFallprotectionlineitems.setVisibility(View.GONE);
        liEquipmentlineitems.setVisibility(View.GONE);
        liScaffoldlineitems.setVisibility(View.GONE);
        liToolslineitems.setVisibility(View.GONE);
        liSubcontractorlineitems.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.liErosioncontrol) {
            Count++;
            if (Count % 2 == 1) {
                hideAll();
                Count++;
                liErosioncontrollineitem.setVisibility(View.VISIBLE);


            } else if (Count % 2 == 0) {
                hideAll();

            }

        } else if (v.getId() == R.id.liGeneralsafety) {
            Count1++;
            if (Count1 % 2 == 1) {
                hideAll();

                Count1++;
                liGeneralsafetylineitems.setVisibility(View.VISIBLE);


            } else if (Count1 % 2 == 0) {
                hideAll();

            }
        } else if (v.getId() == R.id.liUtilities) {
            Count2++;
            if (Count2 % 2 == 1) {
                hideAll();
                Count2++;

                liUtilitylineitems.setVisibility(View.VISIBLE);


            } else if (Count2 % 2 == 0) {
                hideAll();

            }
        } else if (v.getId() == R.id.liHousekeeping) {
            Count3++;
            if (Count3 % 2 == 1) {
                hideAll();
                Count3++;
                liHousekeepinglineitems.setVisibility(View.VISIBLE);


            } else if (Count3 % 2 == 0) {
                hideAll();

            }
        } else if (v.getId() == R.id.liFireprotection) {
            Count4++;
            if (Count4 % 2 == 1) {

                hideAll();
                Count4++;
                liFireprotectionlineitems.setVisibility(View.VISIBLE);


            } else if (Count4 % 2 == 0) {
                hideAll();

            }
        } else if (v.getId() == R.id.liExcavation) {
            Count5++;
            if (Count5 % 2 == 1) {
                hideAll();
                Count5++;
                liEvacuationlineitems.setVisibility(View.VISIBLE);


            } else if (Count5 % 2 == 0) {
                hideAll();

            }
        } else if (v.getId() == R.id.liFallprotection) {
            Count6++;
            if (Count6 % 2 == 1) {
                hideAll();
                Count6++;
                liFallprotectionlineitems.setVisibility(View.VISIBLE);


            } else if (Count6 % 2 == 0) {
                hideAll();

            }
        } else if (v.getId() == R.id.liEquipment) {
            Count7++;
            if (Count7 % 2 == 1) {
                hideAll();
                Count7++;

                liEquipmentlineitems.setVisibility(View.VISIBLE);


            } else if (Count7 % 2 == 0) {
                hideAll();

            }
        } else if (v.getId() == R.id.liScaffold) {
            Count8++;
            if (Count8 % 2 == 1) {
                hideAll();
                Count8++;
                liScaffoldlineitems.setVisibility(View.VISIBLE);


            } else if (Count8 % 2 == 0) {
                hideAll();

            }
        } else if (v.getId() == R.id.liTools) {
            Count9++;
            if (Count9 % 2 == 1) {
                hideAll();

                Count9++;
                liToolslineitems.setVisibility(View.VISIBLE);

            } else if (Count9 % 2 == 0) {
                hideAll();


            }
        } else if (v.getId() == R.id.liSubcontractor) {
            Count10++;
            if (Count10 % 2 == 1) {
                hideAll();
                Count10++;
                liSubcontractorlineitems.setVisibility(View.VISIBLE);
            } else if (Count10 % 2 == 0) {
                hideAll();
            }

        }
    }
}
