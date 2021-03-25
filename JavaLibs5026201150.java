import javax.swing.JOptionPane;
public class JavaLibs5026201150 {

	public static void main(String[] args) {
		Double jam, jam2;

		String nama = JOptionPane.showInputDialog("Sudah siap ketemu sama temen online? yuk isi dulu nama kamu");
		String umur = JOptionPane.showInputDialog("Berapa umurmu?");
		String domisili = JOptionPane.showInputDialog("Kamu domisili mana?");
		String deskripsi = JOptionPane.showInputDialog("Kamu mendeskripsikan dirimu seperti apa?");
		String kegiatan = JOptionPane.showInputDialog("Kalau bosan biasa ngapain?");
		String jam1 = JOptionPane.showInputDialog("Berapa jam kamu kamu lakuin kegiatan itu dalam sehari?");
		String film = JOptionPane.showInputDialog("Film favoritmu apa?");
		String karakter = JOptionPane.showInputDialog("Siapa karakter favortimu di film itu?");
		String impian = JOptionPane.showInputDialog("Apa impian kamu di masa depan?");
		String usaha = JOptionPane.showInputDialog("Usaha apa yang kamu lakukan untuk menggapainya?");

		int umur1 = Integer.parseInt(umur);
		int umur2 = umur1+1;
		jam = Double.parseDouble(jam1);
		jam2 = (jam)-1.5;
		

		
		JOptionPane.showMessageDialog(null,"Hai,"+" "+nama+" "+"salam kenal. Perkenalkan aku Kangchan, teman online kamu mulai sekarang."+
		"\nAku seneng banget punya teman baru, apa kamu juga begitu xixixi."+
		"\nOh iya umur kamu"+" "+umur1+" "+"tahun ya, btw aku"+" "+umur2+" "+"tahun, setahun lebih tua hehe. Gimana rasanya tinggal di"+" "+domisili+"?"+ 
		"\npasti enak ya. Btw kamu mirip banget sama aku sering dibilang"+" "+deskripsi+" "+"padahal engga,"+ 
 		"\nbelum kenal aja itu sebenarnya wkwkwk. Wah kalau bosan kamu suka"+ " " +kegiatan+" "+"juga HAHAHA,"+ 
 		"\ntapi kamu lama banget sampe"+" "+jam1+" "+"jam sehari, aku cuma"+" "+jam2+" "+"jam biasanya."+ 
		"\nEh tadi kamu mention kalo suka"+" "+film+" "+"ya, sumpahh aku juga lagi mantengin itu si dan suka bangettt,"+ 
		"\ntapi karakter favorit aku bukan"+" "+karakter+" "+", ada dee yang lain,"+  
		"\nga apa berarti sekarang aku punya temen ajak streaming bareng."+ 
		"\nOkede, makasi yaa udah jadi temen online aku, semoga impian kamu buat"+" "+impian+" "+"tercapai"+
		"\nsehingga usaha kamu"+" "+usaha+" "+"ga sia-sia, babayy.");
		}
}
