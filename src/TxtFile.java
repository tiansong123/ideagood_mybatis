import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;

import org.mybatis.generator.logging.Log;
import org.mybatis.generator.logging.LogFactory;

import nl.flotsam.xeger.Xeger;

public class TxtFile {
	private final static Log logger = LogFactory.getLog(TxtFile.class);
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;
	InputStreamReader reader;

	/**
	 * 生成数据文件
	 * 
	 * @param filePath
	 *            写入文件的路径
	 * @param content
	 *            写入的字符串内容
	 * @return
	 */
	public boolean string2File(String content, String filePath) {
		boolean flag = true;
		try {
			File file = new File(filePath);
			if (!file.exists()) {
				file.createNewFile();
			}
			bufferedReader = new BufferedReader(new StringReader(content));
			bufferedWriter = new BufferedWriter(new FileWriter(file));
			char buffer[] = new char[1024];
			int len;
			while ((len = bufferedReader.read(buffer)) != -1) {
				bufferedWriter.write(buffer, 0, len);
			}
			bufferedWriter.flush();
			bufferedReader.close();
			bufferedWriter.close();
		} catch (IOException e) {
			flag = false;
			return flag;
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
				}
			}
		}
		return flag;
	}

	/**
	 * 读取数据文件
	 * 
	 * @param filePath
	 *            读取的文件路径
	 * @param encoding
	 *            读取后的字符串编码集设置
	 * @return
	 */
	public String file2String(String filePath, String encoding) {
		StringWriter writer = new StringWriter();
		File file = new File(filePath);
		try {
			if (encoding == null || "".equals(encoding.trim())) {
				reader = new InputStreamReader(new FileInputStream(file));
			} else {
				reader = new InputStreamReader(new FileInputStream(file), encoding);
			}
			// 将输入流写入输出流
			char[] buffer = new char[1024];
			int n = 0;
			while (-1 != (n = reader.read(buffer))) {
				writer.write(buffer, 0, n);
			}
		} catch (Exception e) {
			return null;
		} finally {
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {
				}
		}
		// 返回转换结果
		if (writer != null) {
			return writer.toString();
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		StringBuffer stringBuffer =new StringBuffer();
		for (int i = 1; i <= 10001; i++) {
			stringBuffer.append(getMac()+"\r\n");
		}
		new TxtFile().string2File(stringBuffer.toString(), "F:/c.txt");
		System.out.println(new TxtFile().file2String("F:/c.txt", null));
	}
	
	public static String getMac() {
		String regex = "([0-9A-F]{2}[:]){5}([0-9A-F]{2})";
		Xeger generator = new Xeger(regex);
		String result = generator.generate();
		assert result.matches(regex);
		return result;
	}
}