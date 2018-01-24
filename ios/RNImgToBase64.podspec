
Pod::Spec.new do |s|
  s.name         = "RNImgToBase64"
  s.version      = "0.1.0"
  s.summary      = "RNImgToBase64"
  s.description  = <<-DESC
                    Convert img to base64
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  s.author       = { "author" => "contact@snapp.fr" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/Snapp-FidMe/react-native-img-to-base64", :tag => "master" }
  s.source_files  = "RNImgToBase64/**/*.{h,m}"
  s.requires_arc = true

  s.dependency "React"

end

  