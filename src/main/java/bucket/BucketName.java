package bucket;

public enum BucketName {
	
	PROFILE_IMAGE("descompila-image-upload");
	
	private final String bucketName;

	private BucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBucketName() {
		return bucketName;
	}
	
	
}
