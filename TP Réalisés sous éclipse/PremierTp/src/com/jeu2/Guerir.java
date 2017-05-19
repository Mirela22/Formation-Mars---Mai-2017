
	package com.jeu2;
	import com.jeu2.Personnage;

	public class Guerir implements Runnable {
			
				Personnage aGuerir;
		
				public Guerir (Personnage aGuerir){
					this.aGuerir=aGuerir;				
				}
						
						public void run() {
							for (int i =0; i<5; i++){
							
							aGuerir.guerir(aGuerir);
							
								try {					
									Thread.sleep(6000);	
								}catch (InterruptedException e) {
									e.printStackTrace();
								}
								}
							}
		}



