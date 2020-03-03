package cds.healpix;

/**
 * Defines an object accepting HEALPix Cells.
 * It is used in the Range to Cell method (see the Range class).
 * 
 * @author F.-X. Pineau
 */
public interface CellSink {

  void push(int depth, long hash);
  
}
