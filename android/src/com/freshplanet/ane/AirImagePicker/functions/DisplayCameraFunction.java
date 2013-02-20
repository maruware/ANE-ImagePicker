package com.freshplanet.ane.AirImagePicker.functions;

import android.content.Intent;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.freshplanet.ane.AirImagePicker.AirImagePickerExtensionContext;
import com.freshplanet.ane.AirImagePicker.PickerActivity;

public class DisplayCameraFunction implements FREFunction
{
	@Override
	public FREObject call(FREContext context, FREObject[] args)
	{
		AirImagePickerExtensionContext ctx = (AirImagePickerExtensionContext)context;
		
		Intent intent = new Intent(ctx.getActivity().getApplicationContext(), PickerActivity.class);
		intent.putExtra("action", AirImagePickerExtensionContext.TAKE_PICTURE);
		
		ctx.getActivity().startActivity(intent);
		
		return null;
	}
}
