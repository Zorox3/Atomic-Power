package de.atomicpower.renderer;

import org.lwjgl.opengl.GL11;

import de.atomicpower.lib.Reference;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class AtomicGeneratorFloorRenderer extends TileEntitySpecialRenderer {

	private final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "/textures/models/generatorFloor.png");
	private int textureWidth = 32;
	private int textureHeight = 32;
	private float pixel = 1f/16f;
	
	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double distanceX,
			double distanceY, double distanceZ, float f) {
		
		GL11.glPushMatrix();
		{
			GL11.glTranslatef((float) distanceX, (float) distanceY,
					(float) distanceZ);

			Tessellator tesselator = Tessellator.instance;
			this.bindTexture(texture);
			tesselator.startDrawingQuads();
			{
//				System.out.println(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord));
				if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == 0){
					tesselator.addVertexWithUV(1, 0.2f, 1, 1f/textureWidth * (32), 1f/textureHeight * (32));
					tesselator.addVertexWithUV(1, 0.2f, 0, 1f/textureWidth * (32), 1f/textureHeight * (0));
					tesselator.addVertexWithUV(0, 0.2f, 0, 1f/textureWidth * (0), 1f/textureHeight * (0));
					tesselator.addVertexWithUV(0, 0.2f, 1, 1f/textureWidth * (0), 1f/textureHeight * (32));

				}
				
				if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == 1){
					tesselator.addVertexWithUV(0.5f, 0.2f, 0.5f, 1f/textureWidth * (32), 1f/textureHeight * (32));
					tesselator.addVertexWithUV(0.5f, 0.2f, 0, 1f/textureWidth * (32), 1f/textureHeight * (8+16));
					tesselator.addVertexWithUV(0, 0.2f, 0, 1f/textureWidth * (8+16), 1f/textureHeight * (8+16));
					tesselator.addVertexWithUV(0, 0.2f, 0.5f, 1f/textureWidth * (8+16), 1f/textureHeight * (32));

				}
				if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == 2){
					tesselator.addVertexWithUV(0.5f, 0.2f, 1f, 1f/textureWidth * (32), 1f/textureHeight * (8+16));
					tesselator.addVertexWithUV(0.5f, 0.2f, 0, 1f/textureWidth * (32), 1f/textureHeight * (8));
					tesselator.addVertexWithUV(0, 0.2f, 0, 1f/textureWidth * (8+16), 1f/textureHeight * (8));
					tesselator.addVertexWithUV(0, 0.2f, 1f, 1f/textureWidth * (8+16), 1f/textureHeight * (8+16));

				}
				if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == 3){
					tesselator.addVertexWithUV(0.5f, 0.2f, 1f, 1f/textureWidth * (32), 1f/textureHeight * (8));
					tesselator.addVertexWithUV(0.5f, 0.2f, 0.5f, 1f/textureWidth * (32), 1f/textureHeight * (0));
					tesselator.addVertexWithUV(0, 0.2f, 0.5f, 1f/textureWidth * (8+16), 1f/textureHeight * (0));
					tesselator.addVertexWithUV(0, 0.2f, 1f, 1f/textureWidth * (8+16), 1f/textureHeight * (8));

				}
				if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == 4){
					tesselator.addVertexWithUV(1, 0.2f, 0.5f, 1f/textureWidth * (8+16), 1f/textureHeight * (32));
					tesselator.addVertexWithUV(1, 0.2f, 0, 1f/textureWidth * (8+16), 1f/textureHeight * (8+16));
					tesselator.addVertexWithUV(0, 0.2f, 0, 1f/textureWidth * (8), 1f/textureHeight * (8+16));
					tesselator.addVertexWithUV(0, 0.2f, 0.5f, 1f/textureWidth * (8), 1f/textureHeight * (32));

				}		
				if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == 5){
					tesselator.addVertexWithUV(1, 0.2f, 1, 1f/textureWidth * (8+16), 1f/textureHeight * (8+16));
					tesselator.addVertexWithUV(1, 0.2f, 0, 1f/textureWidth * (8+16), 1f/textureHeight * 8);
					tesselator.addVertexWithUV(0, 0.2f, 0, 1f/textureWidth * 8, 1f/textureHeight * 8);
					tesselator.addVertexWithUV(0, 0.2f, 1, 1f/textureWidth * 8, 1f/textureHeight * (8+16));

				}
				if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == 6){
					tesselator.addVertexWithUV(1, 0.2f, 1, 1f/textureWidth * (8+16), 1f/textureHeight * (8));
					tesselator.addVertexWithUV(1, 0.2f, 0.5f, 1f/textureWidth * (8+16), 1f/textureHeight * (0));
					tesselator.addVertexWithUV(0, 0.2f, 0.5f, 1f/textureWidth * (8), 1f/textureHeight * (0));
					tesselator.addVertexWithUV(0, 0.2f, 1, 1f/textureWidth * (8), 1f/textureHeight * (8));

				}
				if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == 7){
					tesselator.addVertexWithUV(1, 0.2f, 0.5f, 1f/textureWidth * (8), 1f/textureHeight * (32));
					tesselator.addVertexWithUV(1, 0.2f, 0, 1f/textureWidth * (8), 1f/textureHeight * (8+16));
					tesselator.addVertexWithUV(0.5f, 0.2f, 0, 1f/textureWidth * (0), 1f/textureHeight * (8+16));
					tesselator.addVertexWithUV(0.5f, 0.2f, 0.5f, 1f/textureWidth * (0), 1f/textureHeight * (32));

				}
				if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == 8){
					tesselator.addVertexWithUV(1, 0.2f, 1, 1f/textureWidth * (8), 1f/textureHeight * (8+16));
					tesselator.addVertexWithUV(1, 0.2f, 0, 1f/textureWidth * (8), 1f/textureHeight * (8));
					tesselator.addVertexWithUV(0.5f, 0.2f, 0, 1f/textureWidth * (0), 1f/textureHeight * (8));
					tesselator.addVertexWithUV(0.5f, 0.2f, 1, 1f/textureWidth * (0), 1f/textureHeight * (8+16));

				}
				if(tileEntity.getWorldObj().getBlockMetadata(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord) == 9){
					tesselator.addVertexWithUV(1, 0.2f, 1, 1f/textureWidth * (8), 1f/textureHeight * (8));
					tesselator.addVertexWithUV(1, 0.2f, 0.5f, 1f/textureWidth * (8), 1f/textureHeight * (0));
					tesselator.addVertexWithUV(0.5f, 0.2f, 0.5f, 1f/textureWidth * (0), 1f/textureHeight * (0));
					tesselator.addVertexWithUV(0.5f, 0.2f, 1, 1f/textureWidth * (0), 1f/textureHeight * (8));

				}
			}
			tesselator.draw();
		}
		GL11.glPopMatrix();

	}

}
