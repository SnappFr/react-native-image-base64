
Pod::Spec.new do |s|
  s.name         = "RNImgToBase64"
  s.version      = "1.0.0"
  s.summary      = "RNImgToBase64"
  s.description  = <<-DESC
                  RNImgToBase64
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNImgToBase64.git", :tag => "master" }
  s.source_files  = "RNImgToBase64/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  